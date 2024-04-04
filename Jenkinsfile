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
         stage('create image for docker') {
            steps{
              sh 'docker build -t amitkumar1907/assignment_5:latest .'
            }
        }

        stage('Push the container'){
            steps{
              withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USERNAME')]) {
                sh 'echo "$DOCKER_PASSWORD" | docker login -u $DOCKER_USERNAME --password-stdin'
                sh "docker push  amitkumar1907/assignment_5:latest"
              } 
            }
        }
        
        
       
    }
}
