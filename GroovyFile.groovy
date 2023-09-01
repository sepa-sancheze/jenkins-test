import java.util.Random

def commands = ["ls", "cd", "pwd", "echo", "mkdir"]
def rand = new Random()

pipeline {
    agent any

    stages {
        stage('Stage 1') {
            steps {
                echo commands[rand.nextInt(commands.size())]
            }
        }
        stage('Stage 2') {
            steps {
                echo commands[rand.nextInt(commands.size())]
            }
        }
        stage('Stage 3') {
            steps {
                echo commands[rand.nextInt(commands.size())]
            }
        }
    }
}

