package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboard {
	public WebDriver driver;
	By leave_balance = By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/aside/div[5]/div[2]/div[1]/div/div/span");
	By leave_taken = By.xpath("//span[contains(text(),'0 Leaves')]");
	By total_leave = By.xpath("//div[@class='panel bg-purple']//span[@class='badge bg-teal-800'][contains(text(),'16 Leaves')]");
}
