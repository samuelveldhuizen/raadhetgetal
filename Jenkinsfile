pipeline {
    agent any
    tools {
        maven 'maven_3.0.5'
    }
    stages {
        stage('Compile Stage') {
            steps {
                echo 'compile...'
                sh 'mvn clean compile'
            }
        }
        stage('Testing Stage') {
            steps {
                echo 'testing...'
                sh 'mvn test'
            }
        }
        stage('Deployment Stage') {
            steps {

                nexusArtifactUploader(
                    nexusVersion: 'nexus3',
                    protocol: 'http',
                    nexusUrl: 'my.nexus.address',
                    groupId: 'com.example',
                    version: version,
                    repository: 'RepositoryName',
                    credentialsId: 'CredentialsId',
                    artifacts: [
        [artifactId: projectName,
         classifier: '',
         file: 'my-service-' + version + '.jar',
         type: 'jar']
    ]
                )
                echo 'deploying...'
                sh 'mvn clean'
                echo 'succes!'
            }
        }
pipeline {
    agent any
    tools {
        maven 'maven_3.0.5'
    }
    stages {
        stage('Compile Stage') {
            steps {
                echo 'compile...'
                sh 'mvn clean compile'
            }
        }
        stage('Testing Stage') {
            steps {
                echo 'testing...'
                sh 'mvn test'
            }
        }
        stage('Deployment Stage') {
            steps {

                nexusArtifactUploader(
                    nexusVersion: 'nexus3',
                    protocol: 'http',
                    nexusUrl: 'my.nexus.address',
                    groupId: 'com.example',
                    version: version,
                    repository: 'RepositoryName',
                    credentialsId: 'CredentialsId',
                    artifacts: [
        [artifactId: projectName,
         classifier: '',
         file: 'my-service-' + version + '.jar',
         type: 'jar']
    ]
                )
                echo 'deploying...'
                sh 'mvn clean'
                echo 'succes!'
            }
        }

