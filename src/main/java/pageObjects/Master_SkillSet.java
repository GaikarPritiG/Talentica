package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Master_SkillSet {
	public WebDriver driver;
	By skillcatgrp = By.cssSelector("span[role='combobox']");
	By skillSet = By.name("txtSkillset");
	By submit = By.name("btnSubmit");
	By search = By.cssSelector("input[type='search']");
	By Show = By.name("documentDetails_length");
	By documentDetails_wrapper = By.xpath("//*[@id=\"designationDetails_wrapper\"]");
	By edit = By.cssSelector("a[class='btn border-slate text-slate-800 btn-xs btn-flat btn-icon btn-rounded legitRipple']");
	public Master_SkillSet(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement skillcatgrp() {
		return driver.findElement(skillcatgrp);
	}
	public WebElement skillSet() {
		return driver.findElement(skillSet);
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
