def call(String projectName,String imageName, String dockerHubUser){
   echo "Building the code"
   sh "docker build -t ${dockerHubUser}/${projectName}:${imageName} ."
}
