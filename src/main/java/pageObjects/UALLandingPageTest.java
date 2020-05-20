package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UALLandingPageTest {
	WebDriver driver;

	public UALLandingPageTest(WebDriver driver) {
		this.driver = driver;

	}
	// public String cabin = "Premium economy";
	// public String paxType = "Adults";

	By OWayTrip = By.id("oneway");
	// Selecting the origin
	By Origin = By.id("bookFlightOriginInput");
	By CloseBtn = By.xpath(
			"//div[contains(@class,'bookFlightForm__originDestinationInput')]/button[contains(@class,'clearButton')]");
	// Selecting the Destination
	By Destination = By.id("bookFlightDestinationInput");
	// Selecting the date
	By DepMonth = By.cssSelector(".DateInput_input");
	By DepDate = By.xpath("//div[contains(@class,'CalendarMonthGrid_mont')]");
	// By DepDate =
	// By.xpath("//div[contains(@class,'CalendarMonthGrid_mont')]//td[contains(@aria-label,'July
	// 10, 2020')]");
	// By DepDate = By.xpath("//input[@id='DepartDate']");
	// driver.findElement(By.id("DepartDate")).sendKeys("Dec 15");
	// Selecting the pax
	By Pax = By.id("bookFlightModel.passengers");
	By AdltPax = By.id("NumOfAdults plusBtn");
	By ChildPax = By.id("NumOfChildren04 plusBtn");
	By PaxClsBtn = By.id("passengersCloseBtn");
	// Selecting the class type
	By CabinType = By.id("cabinType");
	// Finding the results
	By FindFlts = By.cssSelector(".app-components-BookFlightForm-bookFlightForm__findFlightBtn--1lbFe");

	public WebElement triptype() {
		return driver.findElement(OWayTrip);
	}

	public WebElement OriginSel() {
		return driver.findElement(Origin);
	}

	public WebElement CloseOrigin() {
		return driver.findElement(CloseBtn);
	}

	public WebElement DestinationSel() {
		return driver.findElement(Destination);
	}

	public WebElement DepMonth() {
		return driver.findElement(DepMonth);
	}

	public WebElement Depdate() {
		return driver.findElement(DepDate);
	}

	@SuppressWarnings("unlikely-arg-type")
	public WebElement getCabinType() {
		return driver.findElement(CabinType);
	}

	public void setCabinType(String cabin) {
		// driver.findElement(CabinType).click();
		if (cabin.equals("Economy")) {
			driver.findElement(By.xpath("//li[@id='cabinType_item-0']")).click();
		} else if (cabin.equals("Premium economy")) {
			driver.findElement(By.xpath("//li[@id='cabinType_item-1']")).click();
		} else if (cabin.equals("Business or First")) {
			driver.findElement(By.xpath("//li[@id='cabinType_item-2']")).click();
		}
	}

	public WebElement SelectPax() {
		return driver.findElement(Pax);
	}

	public WebElement ChoosePax() { // driver.findElement(Pax).click();
									// if(paxtype.equals("Adults"))*/

		for (int i = 1; i < 3; i++) {
			driver.findElement(AdltPax).click();
			driver.findElement(ChildPax).click();
		}

		return driver.findElement(AdltPax);

	}

	public WebElement PaxClose() {
		return driver.findElement(PaxClsBtn);
	}

	public WebElement FindFlights() {
		return driver.findElement(FindFlts);
	}

}
