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

    stage('Analyze') {
      parallel {
        stage('Sonarqube') {
          steps {
            sh './gradlew sonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.login=c9bc37fc21a9593dcc90bd0eedaa708edb5def3b'
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
                echo ' Ready for deploy'
            }
    }

  }
}
