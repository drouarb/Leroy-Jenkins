node {

  def mvnHome = tool 'M3'

  stage('Checkout') {
    checkout scm
  }

  stage('Build') {
    sh "${mvnHome}/bin/mvn clean verify"
  }

  stage('tests') {
    junit allowEmptyResults: true, testResults: 'target/surefire-reports/TEST-*.xml'
  }

  stage('artifacts') {
    stash includes: 'target/*.jar', name: 'build-artifacts'
  }
}
