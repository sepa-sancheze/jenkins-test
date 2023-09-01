import groovy.json.JsonSlurperClassic

def parameterList = [
    string(name: "Version", description: "The Version name that you are Tagging"),
    choice(choices: ["---", "Nuevo", "Viejo"].join("\n"), description: "Estado", name:"State")
]

properties([parameters(parameterList)])

// Declaration of variables
def env = 'ENV'
def group_name = JOB_NAME.split('/')[0]
def count = BRANCH_NAME.indexOf('/')

def version = "npd.${group_name}.${BRANCH_NAME}.---"

pipeline {
    agent any

    stages {
        stage('Obtain information') {
            steps {
                echo "Job name: ${JOB_NAME}"
            }
        }
        stage('Set variables') {
            steps {
                echo "The index is: ${count}"
            }
        }
        stage('Printing Version') {
            steps {
                echo "The version is: ${version}"
            }
        }
    }
}

