import groovy.json.JsonSlurperClassic

def parameterList = [
    string(name: "Version", description: "The Version name that you are Tagging"),
    choice(choices: ["---", "Nuevo", "Viejo"].join("\n"), description: "Estado", name:"State")
]

properties([parameters(parameterList)])

// Declaration of variables
def env = 'ENV'
def version = "npd..${BRANCH_NAME}.---"

pipeline {
    agent any

    stages {
        stage('Obtain information') {
            steps {
                echo "Branch name: ${JOB_NAME}"
            }
        }
        stage('Set variables') {
            steps {
                echo "The environment is: ${env}"
            }
        }
        stage('Printing Version') {
            steps {
                echo "The version is: ${version}"
            }
        }
    }
}

