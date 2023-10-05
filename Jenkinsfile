pipeline {
    agent {
        docker {
            // Use a Docker image that has Docker client installed.
            image 'docker:20.10.7'
            // Mount the Docker socket to enable Docker commands.
            args '-v /var/run/docker.sock:/var/run/docker.sock'
        }
    }
    stages {
        stage('Checkout') {
            steps {
                // Check out your source code from your version control system (e.g., Git).
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build a Docker image from your Spring Boot application.
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