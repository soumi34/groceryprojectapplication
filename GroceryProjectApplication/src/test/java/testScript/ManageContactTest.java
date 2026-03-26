package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends LoginTest {
	public HomePage homepage;
	public ManageContactPage managecontactpage;
	@Test(priority = 1, description = "User is able to submit Manage contact")

	public void verifiedUserIsAbleToSubmitManageContact() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		ManageContactPage managecontactpage = new ManageContactPage(driver);
		managecontactpage=homepage.clickOnManageContactPageMoreInfoButton();
		String phonefeild = "7293081469";
		String emailfeild = "demo@mailto.plus";
		String add="Trivandrum";
		String deltim="10.20.00";
		String dellim="100";
		managecontactpage.clickOnUpdateButton().clickOnThePhoneField(phonefeild, emailfeild, add, deltim, dellim).clickOnTheSubmitButton();
//		managecontactpage.clickOnThePhoneField(phonefeild, emailfeild,add,deltim,dellim);
//		managecontactpage.clickOnTheSubmitButton();
		boolean successpage = managecontactpage.isSuccessMessageDisplayed();
		Assert.assertTrue(successpage);
	}
}
