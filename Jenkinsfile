pipeline {
    agent any
	    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
	    }
    stages {
        stage('One') {
                steps {
                        echo 'Hi'
			
                }
        }
	    stage('Two'){
		steps { 
			bat ('mvn test')
			junit '***/target/*.xml'
       	   }
	 }
        stage('Three') {
                steps {
			echo "Hello"
           }
        }
        stage('Four') {
                parallel {
                        stage('Unit Test') {
                                steps{
                                        echo "Running the unit test..."
                                }
                        }
                        stage('Integration test') {
				steps {
					echo 'Running the integration test..'
				}
                               
			}  }
        }
    }
}

