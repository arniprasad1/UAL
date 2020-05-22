pipeline{
  
agent any
stages{
stage ('Complile Checkout'){
  steps{
   dir("C:\\Users\\arnip\\.jenkins\\workspace\\jenkinsfile-git-maven-testng-pline")  
    {
    bat 'mvn clean compile'
  }
}
}
		stage ('Testing Stage'){
		  steps{
		   dir("E:\apache-maven-3.6.3-bin.zip\apache-maven-3.6.3") 
        {
		   bat 'mvn test'
		}
		}
		}
	

  
}
}
