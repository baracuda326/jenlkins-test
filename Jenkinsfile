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
             withSonarQubeEnv(installationName: 'SonarQube'){
                sh './mvnw clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
             }
               }
           }
        stage('Checkstyle') {
            steps {
                sh './mvnw checkstyle:check'
                recordIssues(tools: [checkStyle(reportEncoding: 'UTF-8')])
            }
        }
    }
}