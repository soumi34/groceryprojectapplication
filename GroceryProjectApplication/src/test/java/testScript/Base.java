package testScript;

import java.io.FileInputStream;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import constant.Constant;

public class Base {
	public WebDriver driver;

	@BeforeMethod
	public void browser_intialization() {
		driver = new EdgeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
	}

	// @AfterMethod
	public void quit_Close() {
		driver.quit();
	}
}
