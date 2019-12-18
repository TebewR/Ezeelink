pipeline {
    agent any
    stages {
        stage('Checkout SCM') {
                steps {
                        echo 'Checkout From SCM'
			git branch : 'master', url : 'https://github.com/TebewR/Pipeline-Test-FirstRun.git' 
			
                }
        }
	    stage('Preparation'){    
		steps {
			echo 'Preparation Before Test'
        }
	    }
        stage('FirstTest') {
                steps {
			echo 'First Test'
			sh 'src/test/java/test/PaketDataTest'

        }
        stage('SecondTest') {
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
}

