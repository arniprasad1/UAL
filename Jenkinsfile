node{
stage ('SCM Checkout'){
  
git 'https://github.com/arniprasad1/UAL.git'
}
stage('Compile-Package')
{
def mvnHome = tool name: 'apache-maven-3.6.3', type: 'maven'  
  sh"${mvnHome}/bin/mvn package"
}
}
