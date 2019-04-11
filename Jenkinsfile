pipeline {
         agent any
         tools {
                 maven 'maven_3.0.5'
         }
         stages {
                 stage ('Compile Stage'){
                         steps {
                                 echo 'compile...'
                                 sh 'mvn clean compile'
                         }
                 }
                  stage ('Testing Stage') {
                         steps {
                                 echo 'testing...'
                                 sh 'mvn test'
                         }
                 }
                  stage ('Deployment Stage') {
                         steps {
 			 nexusArtifactUploader {
		          nexusVersion('nexus3')
		          protocol('http')
		          nexusUrl('localhost:8081/')
		          groupId('sp.sd')
		          version('2.4')
		          repository('NexusArtifactUploader')
		          credentialsId('44620c50-1589-4617-a677-7563985e46e1')
		          artifact {
		              artifactId('nexus-artifact-uploader')
		              type('jar')
		              classifier('debug')
		              file('nexus-artifact-uploader.jar') 
		        }
		          artifact {
		              artifactId('nexus-artifact-uploader')
		              type('hpi')	
		              classifier('debug')
		              file('nexus-artifact-uploader.hpi')
		          }
	        }      
                                 echo 'deploying...'
                                 sh 'mvn clean'
                                 echo 'succes!'
                         }
                 }
         }
}
