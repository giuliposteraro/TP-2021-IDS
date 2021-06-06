pipeline {
  agent any
  stages {
    stage('Prueba') {
      agent any
      steps {
        sh '''ls -a
./gradlew build --scan -s'''
      }
    }

  }
}