pipeline{
    agent any

    stages{
        stage ('Compile Stage'){
            steps {
                "Compile Stage"
                //withMaven(maven : 'Maven_home')
                //sh 'mvn clean compile'
                
            }
        }
    }
        stage ('Testing Stage'){
            steps {
                echo "Testing Stage"
                //withMaven(maven : 'Maven_home'){
                //sh 'mvn test'
            }
        }
    }
        stage ('Deployment Stage'){
            steps {
                echo "Deployment Stage"
                //withMaven(maven : 'Maven_home'){
                //sh 'mvn deploy'
                }
            }
        }
    }
