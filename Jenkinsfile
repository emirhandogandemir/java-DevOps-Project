pipeline {
    agent any
    tools{
    maven 'maven-3.6.3'
    }
     stages {

         stage("checkout scm"){
         steps{
         checkout(scm)
         }
         }
         stage("with mvn build project") {
             steps {
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

          sh  ' docker build -f Dockerfile -t javaDevOps:v1 . '

         }

         }

     }
 }