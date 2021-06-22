pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'sh \'./gradlew build\''
      }
    }

    stage('Test') {
      steps {
        sh 'sh \'./gradlew clean test --info\''
      }
    }

    stage('Analyze') {
      parallel {
        stage('Analyze') {
          steps {
            echo '\'Execute Analyze...\''
          }
        }

        stage('Sonarqube') {
          steps {
            sh 'sh \'./gradlew sonarqube -Dsonar.host.url=http://sonarqube:9000\''
          }
        }

        stage('Jacoco') {
          steps {
            sh 'sh \'./gradlew -i test jacocoTestReport\''
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo '\'Deply...\''
      }
    }

  }
}