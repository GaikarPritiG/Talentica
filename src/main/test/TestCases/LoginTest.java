package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.LoginPage;

public class LoginTest extends  LoginPage {

	LoginPage login = new LoginPage(driver);
	public LoginTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@Test(priority =1)
	public void LoginDetails()
	{
		
		login.getLogin();
			
	}
	
}
