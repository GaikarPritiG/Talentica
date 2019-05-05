package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.Master_Department;
import resources.base;

public class HomePage extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")

	public void basePageNavigation(String Username, String Password) throws IOException {

		// one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getLogin().click();

	}
	public void department(String Dept) {
		Master_Department md=new Master_Department(driver);
		md.Department().sendKeys(Dept);
		md.submit().click();
		md.search().sendKeys(Dept);
	}
	public void designation(String design) {
		Master_Department md=new Master_Department(driver);
		md.Department().sendKeys(design);
		md.submit().click();
		md.search().sendKeys(design);
	}
	
	
	

	@AfterTest
	public void teardown() throws InterruptedException {
Thread.sleep(3000);
		driver.close();
		driver = null;

	}

	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data = new Object[1][2];
		// 0th row
		data[0][0] = "mee002";
		data[0][1] = "12345678";
		// 1st row
		/*data[1][0] = "restricteduser@qw.com";
		data[1][1] = "456788";
		data[1][2] = "Non restricted user";
*/
		return data;

	}
	public Object[][] getdata(){
		Object[][] data=new Object[1][1];
		data[0][0]="IT department";
		return data;
		
	}

}
