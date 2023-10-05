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

    post {
        success {
            // You can add post-build actions here.
            // For example, notify on success or trigger other jobs.
        }
        failure {
            // You can add post-build actions for failure cases.
            // For example, send notifications or perform cleanup.
        }
    }
}