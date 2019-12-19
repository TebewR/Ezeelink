pipeline{
    agent any
    Maven 'maven'
    Java 'JAVA'

    stages{
        stage ('Compile Stage'){
            steps {
                bat'mvn clean compile'
            }
        }
    }
        stage ('Testing Stage'){
            steps {
                bat'mvn test'
            }
        }
    }
        stage ('Deployment Stage'){
            steps {
                echo'maven deployment'
                }
            }
        }
        stage ('Parallel'){
            steps {
                echo'Parallel Testing'
            }
        }
            steps{
                echo'Parallel Testing 2'
            }
    }
