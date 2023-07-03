pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                sh 'echo "Building..."'
                // Add your build commands here
            }
        }
        
        stage('Test') {
            steps {
                sh 'echo "Running tests..."'
                // Add your test commands here
            }
        }
        
        stage('Deploy') {
            steps {
                sh 'echo "Deploying..."'
                // Add your deployment commands here
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline succeeded!'
            // Add any post-success actions here
        }
        
        failure {
            echo 'Pipeline failed!'
            // Add any post-failure actions here
        }
    }
}
