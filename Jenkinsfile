pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven') {
                    bat 'mvn clean compile'
                }
            }
        }
        stage('Parallel Test'){
        parallel{
            stage ('Parallel'){
                steps{
                    echo 'Parellel Pipeline'
                }
            }
            
            stage ('Pipeline'){
                steps{
                    echo 'Parallel Testing'
                }
            }
        }
    }
        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven') {
                    bat 'mvn -Dtest=PaketDataTest test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven') {
                    bat 'mvn deploy'
                }
            }
        }
    }
}
