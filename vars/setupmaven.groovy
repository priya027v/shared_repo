def call() {
    sh '''
        echo "Maven already installed, checking version"
        mvn -version
    '''
}
