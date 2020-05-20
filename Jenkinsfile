agent any
stages{
stage ('Complile Checkout'){
  steps{
   withMaven(maven : 'apache-maven-3.6.3')  
    {
    bat 'mvn clean compile'
  }
}
}
stage ('Testing Stage'){
  steps{
   withMaven(maven : 'apache-maven-3.6.3')  
    {
    bat 'mvn test'
  }
}
}
  stage ('Deployment Stage'){
  steps{
   withMaven(maven : 'apache-maven-3.6.3')  
    {
    bat 'mvn deploy'
  }
}
}
  
}
