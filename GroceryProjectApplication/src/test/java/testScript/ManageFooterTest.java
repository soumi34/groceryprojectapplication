package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;

public class ManageFooterTest extends Base {
	public HomePage homepage;
	public ManageFooterPage managefooterpage;
	@Test(priority = 1, description = "User is able to update Manage footer")

	public void verifiedUserIsAbleToUpdateManageFooter() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		ManageFooterPage managefooterpage = new ManageFooterPage(driver);
		managefooterpage=homepage.clickOnManageFooterPageMoreInfoButton();
		String add = "DB STREET,TRIVANDRUM";
		String emailfeild = "demo@mailto.plus";
		String phoneno = "7293081469";
		managefooterpage.clickOnEditButton().enterTheAddress(add).enterTheEmail(emailfeild).enterThePhone(phoneno).clickOnUpdateButton();
		
//		managefooterpage.enterTheAddress(add);
//		managefooterpage.enterTheEmail(emailfeild);
//		managefooterpage.enterThePhone(phoneno);
//		managefooterpage.clickOnUpdateButton();
		boolean successpage = managefooterpage.isSuccessMessageDisplayed();
		Assert.assertTrue(successpage);
	}
}
