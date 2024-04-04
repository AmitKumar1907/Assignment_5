pipeline {
    agent any

    stages {
        
        stage('Code checkout according to environment') {
            steps {
                script{
                  checkout changelog: false, poll: false, scm: scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'gtihub-credentials', url: 'https://github.com/AmitKumar1907/Assignment_5.git']])
                }
            }
        } 
        stage("Build the code"){
            steps{
              
              sh "mvn -f ./pom.xml clean package"
            }   
        }
        
        
       
    }
}
