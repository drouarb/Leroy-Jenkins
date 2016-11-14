node {
  def mvnHome = tool 'M3'

  stage('Build') {
    sh "${mvnHome}/bin/mvn clean verify"
  }

  stage('Publish-tests') {
    junit allowEmptyResults: true, testResults: 'target/surefire-reports/TEST-*.xml'
  }

  stage('Save') {
    stash includes: 'target/leroy.jenkins-*.jar', name: 'build-artifacts'
  }
}
