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
               sh './mvnw clean verify sonar:sonar \
                          >   -Dsonar.projectKey=jenkins \
                          >   -Dsonar.host.url=http://localhost:9000 \
                          >   -Dsonar.login=11d1f0dad99bfd9acc2043c518cc372bbcd0da7c'
               }
           }
    }
}