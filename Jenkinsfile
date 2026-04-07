pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven-3.9'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/sac090909/cucumberjava.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Publish Cucumber Report') {
            steps {
                publishHTML(target: [
                    reportDir: 'target/cucumber-html-report',
                    reportFiles: 'index.html',
                    reportName: 'Cucumber HTML Report'
                ])
            }
        }
    }
}