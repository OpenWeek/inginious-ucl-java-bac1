import json
import subprocess
import shlex
import sys
import re
from json import JSONDecodeError

from inginious import feedback


def add_indentation_level(to_indent):
    return '    '.join(to_indent.splitlines(keepends=True))


def parsetemplate():
    subprocess.call(['parsetemplate', '-o', 'student/' + exercice + 'Stu.java', 'student/' + exercice + 'Vide.java'],
                    universal_newlines=True)


def run_custom(customscript, execcustom):
    outcustom = 0
    if execcustom != 0:
        outcustom = subprocess.call(['sh', customscript], universal_newlines=True)

    if outcustom != 0:
        exit()


def compile_files(args):
    """
    :param args: the javac command with the javac args, whithout the files to compile
    :return: (outother, output), the stderr of the compilation of student/Exercice.java and student/ExerciceStu.java
    """
    outother = ""
    output = ""
    with open('logOther.out', 'w+') as f:
        subprocess.call(args + ['student/' + exercice + '.java'], universal_newlines=True, stderr=f)
        outother = f.read()

    with open('log.out', 'w+') as f:
        subprocess.call(args + ['student/' + exercice + 'Stu.java'], universal_newlines=True, stderr=f)
        output = f.read()
    return outother, output


def compile_corr(args):
    proc = subprocess.Popen(args + ['student/' + exercice + 'Corr.java'], stdout=subprocess.PIPE,
                            universal_newlines=True)
    outcorr = proc.stdout.read()
    proc.communicate()
    return outcorr


def run(exercice, customscript, corr, execcustom, nexercices, javac_args, java_args, code_litteral):
    run_custom(customscript=customscript, execcustom=execcustom)
    outother, output = compile_files(javac_args)
    outcorr = ""
    if corr != 0:
        outcorr = compile_corr(javac_args)
    erreur_enseignant = 0
    message_enseignant = ""
    if outcorr != "":
        outcorr = add_indentation_level(outcorr)
        erreur_enseignant = 1
        message_enseignant = outcorr

    if outother != "":
        # On indente le message pour le faire passer dans le code-block rst
        outother = add_indentation_level(outother)
        erreur_enseignant = 1
        message_enseignant = message_enseignant + "\n" + outother

    if erreur_enseignant != 0:
        feedback.set_result('failed')
        feedback.set_global_feedback("Le programme ne compile pas: \n " + code_litteral + message_enseignant + "\n")
        sys.exit(0)

    error = 0
    # Si output est vide et qu'il n'y a donc pas d'erreur de compilation
    if output == "":
        with open('err.txt', 'w+') as f:
            # On lance l'exercice 1
            resproc = subprocess.Popen(java_args + ['student/' + exercice], universal_newlines=True, stderr=f,
                                       stdout=subprocess.PIPE)
            resproc.communicate()
            resultat = resproc.returncode
            f.flush()
            f.seek(0)
            outerr = f.read()
        # Si les tests se sont bien passés (valeur de retour = 127)
        if resultat == 127:
            if nexercices == 1:
                feedback.set_result('success')
                feedback.set_problem_feedback("Bravo, votre code est correct !", "q1")
            else:
                j = 1
                while j <= nexercices:
                    # On fait un feedback positif par question
                    feedback.set_result('success')
                    feedback.set_problem_feedback("Vous avez bien répondu à cette question", "q" + str(j))
                    j += 1
        elif resultat == 252:
            feedback.set_result('failed')
            feedback.set_global_feedback("La limite de mémoire de votre programme est dépassée")
            sys.exit(0)
        elif resultat == 253:
            feedback.set_result('timeout')
            feedback.set_global_feedback("La limite de temps d'exécution de votre programme est dépassée")
            exit()
        else:
            # Sinon c'est que les tests ont échoué, le programme possède des erreurs.
            if nexercices == 1:
                outerr = add_indentation_level(outerr).replace('%', '%%')
                feedback.set_result('failed')
                feedback.set_problem_feedback("Il semble que vous ayiez fait des erreurs dans votre code...\n " +
                                              code_litteral + outerr + "\n", "q1")
                error = 1
            else:
                i = 1
                while i <= nexercices:
                    # On récupère un feedback par question dans le System.err, en suivant le format imposé par convention
                    with open('question.out', 'w+') as f2:
                        proc = subprocess.Popen(['sed', '-e', "/Question " + str(i) + " :/,/Question [^\D1] :/!d"],
                                                universal_newlines=True, stdout=f2, stdin=f)
                        proc.communicate()
                        f2.seek(0)
                        regex_question = re.findall('^Question ' + str(i) + ' :\n(.*?)^Question [^\D1] :',
                                                      outerr, re.DOTALL | re.MULTILINE)
                    if len(regex_question) == 0:
                        feedback.set_result('success')
                        feedback.set_problem_feedback("Vous avez bien répondu à cette question", "q" + str(i))
                    else:
                        # On joint les matchs de la regex dans un seul string
                        outerr_question = ''.join(regex_question)
                        outerr_question = add_indentation_level(outerr_question).replace('%', '%%')
                        feed = "Il semble que vous ayiez fait des erreurs dans votre code...\n " + code_litteral + outerr_question + "\n"
                        feedback.set_result('failed')
                        feedback.set_problem_feedback(feed, "q" + str(i))
                    i += 1
                error = 1

                # On vérifie si la tâche s'est bien déroulée ou s'il y a eu un souci, et on fait un feedback de la tâche complète
        if error == 0:
            feedback.set_result('success')
            feedback.set_global_feedback("Bravo, votre code est correct !")
        else:
            feedback.set_result('failed')
            feedback.set_global_feedback("Vous n'avez pas réussi tous les exercices")
    # erreur de compilation
    else:
        with open('outputglobal.out', 'w+') as f:
            output = add_indentation_level(output)
            feed = "Votre programme ne compile pas: \n " + code_litteral + output + "\n"
            feedback.set_result('failed')
            feedback.set_global_feedback(feed)

if __name__ == '__main__':
    try:
        task_options = json.load(open('config.json', 'r'))
    except JSONDecodeError as e:
        print('impossible to parse config.json :')
        print(e)
        task_options = None
        exit()
    code_litteral = ".. code-block:: java\n\n"
    javac = "javac -cp .:/usr/share/java/junit.jar:/usr/share/java/hamcrest-core.jar"
    java = "run_student --time 20 java -ea -cp .:./student:/usr/share/java/junit.jar:/usr/share/java/hamcrest-core.jar"
    javac_args = shlex.split(javac)
    java_args = shlex.split(java)
    run(code_litteral=code_litteral, javac_args=javac_args, java_args=java_args, **task_options)

