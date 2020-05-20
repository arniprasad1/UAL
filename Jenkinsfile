node{
stage ('SCM Checkout'){
git 'https://github.com/arniprasad1/UAL.git'
}
stage('Compile-Package')
{
sh 'mvn package'
}
}
