#! /usr/bin/python3

"""
    script arg : the path to the file where the new run script is located
                 if no arg is specified, the default filepath will be ./run_refactor.py
    This script walks in the file system from the place where it is located and transforms
    old style run scripts to new style run scripts. It creates in the task directory
    a config.json file where all the necessary arguments for the script are located.
    It implies that the run-script is not task-dependent anymore
"""
import json
import os

import re

import sys


def refactor(filename):
    for dirpath, dirs, files in os.walk('.'):
        with open(filename, 'r') as run_file:
            new_run_script = run_file.read()
        for f in files:
            if f == 'run':
                with open(dirpath + '/' + f, 'r') as file:
                    options = {}
                    text = file.read().replace(' ', '')
                    options['exercice'] = re.search('EXERCICE="(.*)"', text).group(1)
                    try:
                        options['customscript'] = re.search('CUSTOMSCRIPT="(.*)"', text).group(1)
                    except AttributeError as e:
                        print('error in ' + dirpath + 'for CUSTOMSCRIPT attribute')
                        print(e)
                        customscript = 'error'
                    try:
                        options['corr'] = int(re.search('CORR=(\d+)', text).group(1))
                    except AttributeError as e:
                        print('error in ' + dirpath + 'for CORR attribute')
                        print(e)
                        options['corr'] = 'error'
                    try:
                        options['execcustom'] = int(re.search('EXECCUSTOM=(\d+)', text).group(1))
                    except AttributeError as e:
                        print('error in ' + dirpath + 'for EXECCUSTOM attribute')
                        print(e)
                        options['execcustom'] = 'error'
                    try:
                        options['nexercices'] = int(re.search('NEXERCICES=(\d+)', text).group(1))
                    except AttributeError as e:
                        print('error in ' + dirpath + 'for NEXERCICES attribute')
                        print(e)
                        options['nexercices'] = 'error'
                    with open(dirpath + '/config.json', 'w+') as f:
                        f.write(json.dumps(options))
                with open(dirpath + '/run', 'w+') as f:
                    f.write(new_run_script)
    print('success')

if __name__ == '__main__':
    filename = sys.argv[1] if len(sys.argv) > 1 else 'run_refactor.py'
    refactor(filename)
