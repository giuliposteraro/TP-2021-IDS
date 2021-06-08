pipeline {
    
    agent any

    stages {
        
        stage('Build') {
            steps { 
                git url: 'https://github.com/giuliposteraro/TP-2021-IDS.git'
                sh './gradlew build'
                sh './gradlew bootRun'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew clean test --no-daemon'
                junit 'build/test-results/test/*.xml'
            }
        }
        
        stage('Validate') {
            steps {
                sh './gradlew check'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Ready for deploy'
            }
        }
    }
}
