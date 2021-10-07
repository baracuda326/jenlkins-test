pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
             }
        }
        stage('Publish') {
            steps {
                sh './mvnw package'
             }
        }
        post {
            success {
                archiveArtifacts 'target/*.jar'
            }
        }
    }
}