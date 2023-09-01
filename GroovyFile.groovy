import groovy.json.JsonSlurperClassic

def parameterList = [
    string(name: "Version", description: "The Version name that you are Tagging"),
    choice(choices: ["---", "Nuevo", "Viejo"].join("\n"), description: "Estado", name:"State")
]

properties([parameters(parameterList)])

// Declaration of variables
def env = 'ENV'

pipeline {
    agent any

    stages {
        stage('Get Parameters') {
            steps {
                echo "The parameters are: ${params}"
            }
        }
        stage('Set variables') {
            steps {
                echo "The environment is: ${env}"
            }
        }
        stage('Stage 3') {
            steps {
                echo 'Random Word 3'
            }
        }
    }
}

