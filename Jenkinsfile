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
             post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
             }
        }
        stage('Publish') {
            steps {
                sh './mvnw package'
             }
             post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
           }
        }
        stage('SonarQube') {
           steps {
               sh './mvnw clean verify sonar:sonar'
               }
           }
    }
}