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
                sh 'mvn test -Dtest=testClass1'
            }
        }
       stage("Run"){
				steps {
								sh "java -cp target/Hello1-1.0-SNAPSHOT.jar demoPackage.demoClass"
							}
				}
    }
}
