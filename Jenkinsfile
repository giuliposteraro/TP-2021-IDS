pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradlew build'
      }
    }

    stage('Test') {
      steps {
        sh './gradlew clean test --info'
      }
    }

    stage('Analyze') {
      parallel {
        stage('Sonarqube') {
          steps {
            sh './gradlew sonarqube -Dsonar.host.url=http://sonarqube:9000'
          }
        }

        stage('Jacoco') {
          steps {
            sh './gradlew -i test jacocoTestReport'
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        sh 'ls'
      }
    }

  }
}