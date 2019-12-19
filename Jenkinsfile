pipeline{
    agent any
    maven "mvn3.6.3"
    jdk "JAVA"

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
