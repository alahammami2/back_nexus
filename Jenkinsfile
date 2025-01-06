pipeline {
    agent any 
    tools { 
        maven 'maven'
    }
    
    stages {
        stage ("Clean up"){
            steps {
                deleteDir()
            }
        }
        stage ("Clone repo"){
            steps {
                sh "git clone https://github.com/alahammami2/back-sonar.git"
            }
        }
         stage("Build"){
      steps{
        dir("back-sonar"){
          sh "mvn clean install"
        }
      }
    }   

    stage("SonarQube Analysis"){
      steps{
        withSonarQubeEnv("sonar-server"){
          dir ("back-sonar"){
            sh 'mvn sonar:sonar'
                }                
            }
        }
    }
}
}
