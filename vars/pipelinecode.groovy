def buildmaven(goal) {
  //defining funtion in groovy scriopt
  echo "Building Project with maven"
  sh 'mvn clean $goal'
}

def checkotcode(){
  echo "checkout the source code"
  checkout scm
}

def setupmaven() {
 sh 'sudo apt install maven -y'
}
