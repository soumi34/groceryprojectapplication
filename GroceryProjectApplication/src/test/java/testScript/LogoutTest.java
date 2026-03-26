package testScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	@Test(priority = 1, description = "User is able to logout")

	public void verifyUserIsAbleToLogout() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignInButton();
		LogoutPage logout = new LogoutPage(driver);
		logout.clickOnTheImageIcon();
		logout.clickOnTheLogoutButton();
		boolean successpage = logout.isSuccessMessageDisplayed();
		Assert.assertTrue(successpage);

	}
}
