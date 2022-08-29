pipeline {
    agent any
    tools {
        jdk 'jdk'
        maven '3.8.3'

    }
    stages {
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
      sh """  docker build -f Dockerfile -t javaDevOps:v1 .
      """
        }

    }
}