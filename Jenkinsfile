node ('master') {
try {

    stage('check tools') {
        sh "java -version"
    }

    stage('checkout') {
        checkout scm
    }

    stage('clean') {
        sh "./gradlew clean"
    }

    stage('packaging') {
         sh "./gradlew build"
    }

    stage('archiveArtifacts') {
    	archiveArtifacts artifacts: '**/*.war,src/docker/Dockerfile,src/docker/docker-compose.yml,src/docker/settings.xml,src/docker/tomcat-users.xml', onlyIfSuccessful: true
    }

 	} catch (e) {
    	currentBuild.result = "FAILED"
    	throw e
  }
}

