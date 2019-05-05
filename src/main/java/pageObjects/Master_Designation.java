package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Master_Designation {
	public WebDriver driver;
	By Designation = By.name("designationname");
	By submit= By.name("btnSubmit");
	By search = By.cssSelector("input[type='search']");
	By Show = By.name("documentDetails_length");
	By designationTable =By.	xpath("//*[@id=\"documentDetails_wrapper\"]");
	public Master_Designation(WebDriver driver) {
		this.driver=driver;
	} 
	public WebElement Designation() {
		return driver.findElement(Designation);
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
		return driver.findElement(designationTable);
	}
}
