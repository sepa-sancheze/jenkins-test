import java.util.Random

def randomCommands = ["ls", "pwd", "echo", "cat", "grep"]

def randomCommand = randomCommands.get(new Random().nextInt(randomCommands.size()))

println "The random command is: ${randomCommand}"

def steps = ["ls", "pwd", "echo", "cat", "grep"]

for (step in steps) {
  println "Running step: ${step}"
  sh "${step}"
}
