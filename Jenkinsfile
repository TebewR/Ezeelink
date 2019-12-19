pipeline{
    agent any
    def mvnhome = tool name: 'maven', type: 'maven'

    stages{
        stage ('compile stage'){
            steps {
                bat'${mvnHome}/bin/mvn clean compile'
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
