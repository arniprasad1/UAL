package E2E.UAL;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.UALLandingPageTest;
import resources.BaseTest;
import pageObjects.dataDrivenTest; 
public class HomePageTest extends BaseTest {
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
			
	}
	@Test
	public void OneWayTripTest() throws InterruptedException, IOException
	{	
		dataDrivenTest dt = new dataDrivenTest();
		ArrayList<String> data = dt.getdata("TestName");
		System.out.println("data.get(1) = " + data.get(1));
		System.out.println("data.get(2) = " + data.get(2));
		System.out.println("data.get(3) = " + data.get(3));
		System.out.println("data.get(4) = " + data.get(4));
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		UALLandingPageTest UALtest = new UALLandingPageTest(driver);
		UALtest.triptype().click();
		UALtest.OriginSel().click();
		UALtest.OriginSel().sendKeys(data.get(1));
		UALtest.CloseOrigin().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		UALtest.OriginSel().sendKeys(data.get(1));
		UALtest.DestinationSel().sendKeys(data.get(2));
		//UALtest.DepMonth().click();
		//UALtest.Depdate().sendKeys(Keys.BACK_SPACE);
		//UALtest.selectMonth().click();
		//UALtest.Depdate().sendKeys(data.get(3));
		UALtest.getCabinType().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UALtest.setCabinType(data.get(4));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UALtest.SelectPax().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UALtest.ChoosePax().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		UALtest.PaxClose().click();
		
		UALtest.FindFlights().click();
		
		
	}
	
	@AfterTest
	public void teardown() throws InterruptedException
	{	
		Thread.sleep(5000);
		driver.close();
		driver=null;
	}
	
	
	
	
	
	
	

}
