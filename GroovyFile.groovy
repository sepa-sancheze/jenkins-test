import groovy.json.JsonSlurperClassic

def parameterList = [
    string(name: "Version", description: "The Version name that you are Tagging"),
    choice(choices: ["---", "Nuevo", "Viejo"].join("\n"), description: "Estado", name:"State")
]

properties([parameters(parameterList)])

// Declaration of variables
def env = 'npd'
def group_name = JOB_NAME.split('/')[0]
def branch = (BRANCH_NAME.indexOf('/') >= 1) ? BRANCH_NAME.split('/')[1] : BRANCH_NAME
def version = "${env}.${group_name}.${branch}.---"

pipeline {
    agent any

    stages {
        stage('Obtain information') {
            steps {
                echo "Job name: ${JOB_NAME}"
            }
        }
        stage('Printing Version') {
            steps {
                echo "The version is: ${version}"
            }
        }
    }
}

