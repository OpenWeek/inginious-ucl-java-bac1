#!/bin/bash

feedback --result "success"

A=$(getinput q1)
B=$(getinput q2)
C=$(getinput q3)
D=$(getinput q4)

if [ $A != "import java.io.*;" ]
then
    echo "L'étudiant a donné la bonne réponse à la question 1"
    feedback --result "failed" --feedback "$A n'est pas la bonne réponse! Essayez à nouveau!" --id "q1"
    feedback --feedback "Il semble que vous ayez fait une erreur"
else
    echo "L'étudiant a échoué la question 1"
fi

if [ $B != "BufferedReader br;" ]
then
    echo "Student has given good answer on question 2" 
    feedback --result "failed" --feedback "$B n'est pas la bonne réponse! Essayez à nouveau!" --id "q2"
    feedback --feedback "Il semble que vous ayez fait une erreur"
else
    echo ""L'étudiant a échoué la question 2"
fi

if [ $C != "str.br.readLine();" ]
then
echo "L'étudiant a donné la bonne réponse à la question 3"
feedback --result "failed" --feedback "$C n'est pas la bonne réponse! Essayez à nouveau!" --id "q3"
feedback --feedback "Il semble que vous ayez fait une erreur"
else
echo ""L'étudiant a échoué la question 3"
fi

if [ $C != "br.close();" ]
then
echo "L'étudiant a donné la bonne réponse à la question 4"
feedback --result "failed" --feedback "$D n'est pas la bonne réponse! Essayez à nouveau!" --id "q4"
feedback --feedback "Il semble que vous ayez fait une erreur"
else
echo ""L'étudiant a échoué la question 4"
fi
