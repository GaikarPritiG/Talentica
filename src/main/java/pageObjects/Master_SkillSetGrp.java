package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Master_SkillSetGrp {
	public WebDriver driver;
	By skillsetgrp = By.cssSelector("a[href='#group']");
	@FindBy(css="span[id='select2-selskillsetcategory-container']")
	WebElement select;
	 @FindBy(id="status")
	   WebElement status_dropdown;
	By skillSetgrpname = By.name("groupname");
	By submit = By.name("btnSubmit");
	By search = By.cssSelector("input[type='search']");
	By Show = By.name("documentDetails_length");
	By documentDetails_wrapper = By.xpath("//*[@id=\"designationDetails_wrapper\"]");
	By edit = By.cssSelector("a[class='btn border-slate text-slate-800 btn-xs btn-flat btn-icon btn-rounded legitRipple']");
	public Master_SkillSetGrp(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement skillsetgrp() {
		return driver.findElement(skillsetgrp);  	
	}
	
	public void select_list(String status){
	     Select statusDropdown=new Select(status_dropdown);
	     statusDropdown.selectByVisibleText(status);
	}
	
	public WebElement skillSetgrpname() {
		return driver.findElement(skillSetgrpname);
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
	public WebElement edit() {
		return driver.findElement(edit);
	}
}
