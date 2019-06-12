pipeline {
    agent {
					docker {	
										image 'maven:3-alpine'
										args  '-v /root/.m2:/root/.m2'
									}
					} 

    stages {
        stage('Build Stage') {
            steps {
                  sh 'mvn clean install'
            }
        }
        stage('Test Stage') {
            steps {
                echo "Testing stuff"
            }
        }
    }
}
