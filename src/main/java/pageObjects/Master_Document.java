package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Master_Document {
	public WebDriver driver;
	By designationame = By.name("designationname");
	By submit = By.name("btnSubmit");
	By search = By.cssSelector("input[type='search']");
	By Show = By.name("documentDetails_length");
	By documentDetails_wrapper = By.xpath("//*[@id=\"designationDetails_wrapper\"]");

	public Master_Document(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement designatioName() {
		return driver.findElement(designationame);
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
