def call(String project, String imageTag,String dockerHubUser){
  withCredentials([usernamePassword(
              credentialsId:"DockerHubCred",
              usernameVariable: "dockerHubUser", 
               passwordVariable: "dockerHubPass")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker image tag ${project}:${imageTag} ${env.dockerHubUser}/${project}:${imageTag}"
                sh "docker push ${env.dockerHubUser}/${project}:${imageTag}"
            }
}
