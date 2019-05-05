package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Master_SkillCat {
	public WebDriver driver;
	By skillCat = By.name("skillsetcategory");
	By submit= By.name("btnSubmit");
	By search = By.cssSelector("input[type='search']");
	By Show = By.name("documentDetails_length");
	By DepartmentTable =By.xpath("//*[@id=\"documentDetails_wrapper\"]");
	By edit = By.xpath("a[class='btn border-slate text-slate-800 btn-xs btn-flat btn-icon btn-rounded legitRipple']"); 
	public Master_SkillCat(WebDriver driver) {
		this.driver=driver;
	} 
	public WebElement Department() {
		return driver.findElement(skillCat);
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
	public WebElement edit() {
		return driver.findElement(edit);
	}
}
