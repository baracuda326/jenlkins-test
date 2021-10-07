pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/baracuda326/jenlkins-test.git'
                sh './mvnw clean compile'
            }
        }
    }
}