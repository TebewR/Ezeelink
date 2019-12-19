pipeline{
    agent any
    
    stages{
        stage ('compile stage'){
            steps {
                withMaven(maven : 'maven'){
                    bat 'mvn clean compile'
                }
            }
        }
        stage ('testing stage'){
            steps {
                withMaven(maven : 'maven'){
                    bat 'mvn test'
                }
            }
        }
        stage ('deployment stage'){
            steps {
                withMaven(maven : 'maven'){
                    bat 'mvn deploy'
             }
          }
       }
    }
}
