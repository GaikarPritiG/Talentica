package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Master_Leavetype {
	public WebDriver driver;
	By leavename = By.name("leavename");
	By shortname = By.name("shortname");
	By Status = By.xpath("//*[@id=\"active\"]");
	By submit = By.name("btnSubmit");
	By search = By.cssSelector("input[type='search']");
	By Show = By.name("documentDetails_length");
	By documentDetails_wrapper = By.xpath("//*[@id=\"designationDetails_wrapper\"]");

	public Master_Leavetype(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement leaveName() {
		return driver.findElement(leavename);
	}
	
	public WebElement shortName() {
		return driver.findElement(shortname);
	}
	
	public WebElement Status() {
		return driver.findElement(Status);
	}

	public WebElement submit() {
		return driver.findElement(submit);
	}

	public WebElement search() {
		return driver.findElement(search);
	}

	public WebElement show() {
		return driver.findElement(Show);
	}

	public WebElement designationTable() {
		return driver.findElement(documentDetails_wrapper);
	}
}
