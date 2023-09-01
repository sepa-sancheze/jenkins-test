import groovy.json.JsonSlurperClassic

def parameterList = [
    string(name: "Version", description: "The Version name that you are Tagging"),
    choice(choices: ["---", "Nuevo", "Viejo"].join("\n"), description: "Estado", name:"State")
]

properties([parameters(parameterList)])

pipeline {
    agent any

    stages {
        stage('Stage 1') {
            steps {
                echo 'Random Word 1'
            }
        }
        stage('Stage 2') {
            steps {
                echo 'Random Word 2'
            }
        }
        stage('Stage 3') {
            steps {
                echo 'Random Word 3'
            }
        }
    }
}

