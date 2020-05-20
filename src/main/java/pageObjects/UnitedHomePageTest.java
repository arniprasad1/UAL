package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitedHomePageTest {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	// Opening the browser
	driver.get("https://www.united.com/en/us");
	driver.manage().window().maximize();
	driver.findElement(By.id("oneway")).click();
	//driver.findElement(By.id("roundtrip")).click();
	
	//identifying and entering in origin
	driver.findElement(By.id("bookFlightOriginInput")).click();
	driver.findElement(By.id("bookFlightOriginInput")).sendKeys(" ");
	driver.findElement(By.xpath("//div[contains(@class,'bookFlightForm__originDestinationInput')]/button[contains(@class,'clearButton')]")).click();
	driver.findElement(By.id("bookFlightOriginInput")).sendKeys("Den");
	Thread.sleep(2000);
	driver.findElement(By.id("bookFlightOriginInput")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.id("bookFlightOriginInput")).sendKeys(Keys.ENTER);
	
	//identifying and entering in Destination
	driver.findElement(By.id("bookFlightDestinationInput")).click();
	//driver.findElement(By.id("bookFlightDestinationInput")).sendKeys(" ");
	//driver.findElement(By.xpath("//div[contains(@class,'bookFlightForm__originDestinationInput')]/button[contains(@class,'clearButton')]")).click();
	driver.findElement(By.id("bookFlightDestinationInput")).sendKeys("NYC");
	Thread.sleep(2000);
	for(int i=1;i<4;i++)
	{
	driver.findElement(By.id("bookFlightDestinationInput")).sendKeys(Keys.ARROW_DOWN);
	}
	driver.findElement(By.id("bookFlightDestinationInput")).sendKeys(Keys.ENTER);
	
	//driver.findElement(By.id("bookFlightDestinationInput")).sendKeys("ver, CO, US (DEN)");
	//driver.findElement(By.id("DepartDate")).click();
	driver.findElement(By.cssSelector(".DateInput_input")).click();
	//driver.findElement(By.id("DepartDate")).sendKeys("Dec 15");
	driver.findElement(By.id("bookFlightModel.passengers")).click();
	for(int i=1;i<4;i++)
	{
	driver.findElement(By.id("NumOfAdults plusBtn")).click();
	}
	driver.findElement(By.id("passengersCloseBtn")).click();
	driver.findElement(By.id("cabinType")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id='cabinType_item-1']")).click();
	driver.findElement(By.cssSelector(".app-components-BookFlightForm-bookFlightForm__findFlightBtn--1lbFe")).click();
	
	
	//driver.findElement(By.xpath("//div[contains(@class,'bookFlightForm__originDestinationInput')]/button[contains(@class,'clearButton')]")).click();
	
	Thread.sleep(2000);
	
	
	//driver.findElement(By.xpath("//input[@value='Boston BOS']")).click();
		//driver.findElement(By.xpath("(//input[@value='New York LGA'])[2]")).click();
		
		
		//(//input[@value='Boston BOS'])[2]
		

		
		
	}
}
