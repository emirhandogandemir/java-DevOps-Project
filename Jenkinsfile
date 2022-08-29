

String registry = "dogandemir51"
String repository="parametrik deger"

pipeline {
    agent any
    tools{
    maven 'Maven3'
    }
    environment{
    DOCKERHUB_CREDENTIALS=credentials('emirhan-dockerhub')
    }
     stages {

         stage("with mvn build project") {
         steps{
          // git 'https://github.com/denizturkmen/SpringBootMysqlCrud.git'
                                   echo "Java VERSION"
                                   sh 'java -version'
                                   echo "Maven VERSION"
                                   sh 'mvn -version'
                                   echo 'building project...'
                                  // sh "mvn compile"
                                  // sh "mvn package"
                                   //sh "mvn test"
                                   sh "mvn clean install"
         }
         }
         stage("docker build image"){
         steps{
          sh  ' docker build -f Dockerfile -t javadevops:v3 . '
         }

         }
         stage("docher hub login"){
         steps{
         sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
         }
         }
         stage("Docker Push Image"){
         steps{
        sh  'docker push dogandemir51/javadevops:v3'

         }

         }
         stage("docker delete local images"){
         steps{
          sh 'docker rmi -f javadevops:v2'
         }


         }

     }
}