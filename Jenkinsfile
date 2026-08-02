pipeline {

    agent any

    tools {
        jdk 'jdk25'
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                url:'https://github.com/kavindideepashika26-max/patient-service'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t patient .'
            }
        }
    }
}

