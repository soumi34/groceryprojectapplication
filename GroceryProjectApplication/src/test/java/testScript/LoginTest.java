package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	public HomePage homepage;
	@Test(priority = 1, description = "Valid Credentials")

	public void verifiedUserIsAbleToLoginWithValidCredential() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		boolean homepage = loginpage.isDashboardDisplayed();
		Assert.assertTrue(homepage);
	}

	@Test(priority = 2, description = "InValid Username with valid password")

	public void verifiedUserIsNotAbleToLoginWithInvalidUsername() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "loginpage");
		String password = ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		boolean hmpage = loginpage.isErrorMessageDisplayed();
		Assert.assertTrue(hmpage);
	}

	@Test(priority = 3, description = "Valid Username with invalid password")

	public void verifiedUserIsNotAbleToLoginWithInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(3, 0, "loginpage");
		String password = ExcelUtility.getStringData(3, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		boolean hmpage = loginpage.isErrorMessageDisplayed();
		Assert.assertTrue(hmpage);
	}

	@Test(priority = 4, description = "InValid Username with invalid password")

	public void verifiedUserIsNotAbleToLoginWithInvalidUsername_Password() throws IOException {
		String username = ExcelUtility.getStringData(4, 0, "loginpage");
		String password = ExcelUtility.getStringData(4, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		boolean hmpage = loginpage.isErrorMessageDisplayed();
		Assert.assertTrue(hmpage);
	}
}
