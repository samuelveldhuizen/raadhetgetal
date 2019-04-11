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
                    nexusUrl: 'localhost:8081',
                    groupId: 'com.sam',
                    version: 1.0,
                    repository: 'RaadHetGetal',
                    credentialsId: '291bdd7f-a44e-49dc-ba4b-6ee90d4b7ce8',
                    artifacts: [
        [artifactId: RaadHetGetal,
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

