pipeline{
    agent any
    Maven 'maven_home'
    Java 'JAVA'

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
