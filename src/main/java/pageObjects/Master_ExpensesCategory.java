package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mongodb.operation.FindAndDeleteOperation;

public class Master_ExpensesCategory {
	public WebDriver driver;
	By desMapping = By.cssSelector("a[href='#tab_grade']");
	By selectDes = By.cssSelector("span[class='select2-selection select2-selection--multiple']");
	By subCategory = By.xpath("//*[@id=\"frmExpenseCategory\"]/div[1]/div[2]/div/span/span[1]/span");
	By subcatw = By.xpath("//div[@class='panel-body']//label[2]");
	By amtWise = By.xpath("//div[@class='panel-body']//label[3]");
	By selSubCat = By.xpath("//select[@id='selDesiSubCategory']");
	By submit = By.name("btnSubmit");
	By search = By.cssSelector("input[type='search']");
	By Show = By.name("documentDetails_length");
	By documentDetails_wrapper = By.xpath("//*[@id=\"designationDetails_wrapper\"]");
	By edit = By.xpath("a[class='text-bold edit_grade_mapping']");
	By delete = By.xpath("a[class='text-bold text-danger delete_grade_mapping']");

	public Master_ExpensesCategory(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement desMapping() {
		return driver.findElement(desMapping);
	}

	public WebElement selectDes() {
		return driver.findElement(selectDes);
	}

	public WebElement subCategory() {
		return driver.findElement(subCategory);
	}

	public WebElement subcatw() {
		return driver.findElement(subcatw);
	}

	public WebElement amtWise() {
		return driver.findElement(amtWise);
	}

	public WebElement selSubCat() {
		return driver.findElement(selSubCat);
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

	public WebElement delete() {
		return driver.findElement(delete);
	}
}
