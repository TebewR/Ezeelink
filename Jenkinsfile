pipeline{
    agent any
    maven 'maven'
    jdk 'JAVA'

    stages{
        stage ('compile stage'){
            steps {
                bat'mvn clean compile'
            }
        }
    }
        stage ('testing stage'){
            steps {
                bat'mvn test'
            }
        }
    }
        stage ('deployment stage'){
            steps {
                echo'maven deployment'
                }
            }
        stage ('parallel'){
            steps {
                echo'Parallel Testing'
            }
        }
            steps{
                echo'Parallel Testing 2'
            }
