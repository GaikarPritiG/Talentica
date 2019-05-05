package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Master_DesignationMapping {
	public WebDriver driver;
	By categories = By.cssSelector("a[href='#tab_category']");
	By categoryName = By.name("categoryname");
	By icon = By.xpath("//*[@id=\"frmExpenseCategory\"]/div/div[2]/div/span/span[1]/span");
	By description = By.name("txtDesc");
	By submit = By.name("btnSubmit");
	By search = By.cssSelector("input[type='search']");
	By Show = By.name("documentDetails_length");
	By documentDetails_wrapper = By.xpath("//*[@id=\"designationDetails_wrapper\"]");

	public Master_DesignationMapping(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement categoryTab() {
		return driver.findElement(categories);
	}
	public WebElement categoryName() {
		return driver.findElement(categoryName);
	}
	
	public WebElement icon() {
		return driver.findElement(icon);
	}
	
	public WebElement description() {
		return driver.findElement(description);
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
