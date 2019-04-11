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
                    repository: '/#browse/browse/assets:maven-snapshots',
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
	}
}

