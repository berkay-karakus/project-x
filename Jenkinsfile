pipeline {
  agent any
  tools {
    maven 'maven-tool'
  }
  options {
    skipStagesAfterUnstable()
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}
