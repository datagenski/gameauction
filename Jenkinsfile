pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Check out your source code from your version control system (e.g., Git).
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Use Maven to build your Spring Boot application.
                sh 'docker build -t gameauction-app .'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your Spring Boot application using Docker Compose.
                sh 'docker-compose up -d'
            }
        }
    }
}