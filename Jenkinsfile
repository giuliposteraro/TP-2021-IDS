pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withGradle() {
          sh '''git pull 
./gradle build'''
        }

      }
    }

    stage('Test') {
      steps {
        sh './gradlew clean test --info'
      }
    }

    stage('Validate') {
      steps {
        sh 'gradle/wrapper-validation-action@v1'
      }
    }

    stage('Deploy') {
      steps {
        sh 'ls'
      }
    }

  }
}