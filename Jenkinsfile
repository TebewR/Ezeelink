pipeline{
    agent any
    maven 'Maven_home'
    java 'JAVA'

    stages{
        stage ('compile stage'){
            steps {
                bat'mvn clean compile'
            }
        }
        stage ('testing stage'){
            steps {
                bat'mvn test'
            }
        }
        stage ('deployment stage'){
            steps {
                echo'maven deployment'
                }
            }
    }
}
