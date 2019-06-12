pipeline {
    agent any 

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
       stage("Run Stage"){
				steps {
								sh "java -cp target/Hello1-1.0-SNAPSHOT.jar demoPackage.demoClass"
							}
				}
    }
}
