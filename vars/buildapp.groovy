def call(goal) {
  //defining funtion in groovy scriopt
  echo "Building Project with maven"
  sh 'mvn clean $goal'
}
