pipeline {
    agent any
    stages {
        stage('One') {
                steps {
			echo "Checkout From SCM"
                       	git branch : 'master', url : 'https://github.com/TebewR/Pipeline-Test-FirstRun.git'

			
                }
        }
	    stage('Two'){
		    
		steps {
			echo 'Preparation Before Test'
        }
	    }
        stage('Three') {
		steps {
			echo 'First Test'
			sh 'src\test\java\test\PaketDataTest'
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
