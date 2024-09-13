pipeline {
  agent any
  tools {
    maven 'maven-tool'
    dockerTool 'docker-tool'
  }
  options {
    skipStagesAfterUnstable()
  }
  stages {
    stage('Maven Build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Docker Build') {
      steps {
        sh 'docker build -t project-x'
      }
    }
  }
}
