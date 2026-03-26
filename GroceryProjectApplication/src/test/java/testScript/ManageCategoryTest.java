package testScript;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	public HomePage homepage;
	public ManageCategoryPage managecategorypage;

	@Test(priority = 1, description = "User is able to submit Manage category")

	public void verifiedUserIsAbleToSubmitManageCategory() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		// loginpage.enterThePassword(password);
		homepage = loginpage.clickOnSignInButton();
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage = homepage.clickOnManageCategoryPageMoreInfoButton();
		String field = "Flowers";
		managecategorypage.clickOnNewButton().enterTheCategory(field).clickOnTheDiscountButton().clickOnTheFile()
				.clickOnSaveButton();

//		managecategorypage.enterTheCategory(field);
//		managecategorypage.clickOnTheDiscountButton();
//		String file = "C:\\Users\\Gowrish\\Downloads\\pexels-mariannaole-757889.jpg";
//		managecategorypage.clickOnTheFile();
//		managecategorypage.clickOnSaveButton();
		boolean successpage = managecategorypage.isSuccessMessageDisplayed();
		Assert.assertTrue(successpage);

	}

}
