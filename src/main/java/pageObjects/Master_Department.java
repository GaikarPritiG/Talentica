package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Master_Department {
	public WebDriver driver;
	By Department = By.name("departmentname");
	By submit= By.name("btnSubmit");
	By search = By.cssSelector("input[type='search']");
	By Show = By.name("documentDetails_length");
	By DepartmentTable =By.	xpath("//*[@id=\"documentDetails_wrapper\"]");
	public Master_Department(WebDriver driver) {
		this.driver=driver;
	} 
	public WebElement Department() {
		return driver.findElement(Department);
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
		return driver.findElement(DepartmentTable);
	}
}
