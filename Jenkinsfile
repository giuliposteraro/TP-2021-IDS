pipeline {
  agent any
  stages {
    stage('Prueba') {
      steps {
        sh '''def projectVersion = sh script: "gradle getVersion()", returnStdout: true
def projectGroup= sh script: "gradle getGroup()", returnStdout: true'''
      }
    }

  }
}