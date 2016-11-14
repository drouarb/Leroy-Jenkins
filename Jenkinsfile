node {

  def mvnHome = tool 'M3'

  stage('Checkout') {
    checkout scm
  }

  stage('Build') {
    sh "${mvnHome}/bin/mvn clean install"
  }

  stage('tests') {
    junit allowEmptyResults: true, testResults: 'target/surefire-reports/TEST-*.xml'
  }

  stage('artifacts') {
    archiveArtifacts allowEmptyArchive: true, artifacts: 'target/*.jar', onlyIfSuccessful: true
  }
}
