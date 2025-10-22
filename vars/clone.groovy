def call(String gitUrl,String gitBranch){
  echo "Start the code cloning process"
  git url: "${gitUrl}", branch: "${gitBranch }" 
  echo "Cloned Successfully"
}
