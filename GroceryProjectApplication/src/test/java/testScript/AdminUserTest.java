package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {
	public HomePage homepage;
	public AdminUserPage adminuserpage;
	@Test (priority=1,description="User is able to submit Manage News")

	public void verifiedUserIsAbleToSubmitManageNews() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSignInButton();
		AdminUserPage adminuserpage = new AdminUserPage(driver);
		adminuserpage=homepage.clickOnAdminUserPageMoreInfoButton();
		String name = "Nirved";
		String pwd = "1234";
		adminuserpage.clickOnNewButton().enterTheUsername(name).enterThePassword(pwd).clickOnTheDropdown().dropDown().clickOnSaveButton();

//		adminuserpage.enterTheUsername(name);
//		adminuserpage.enterThePassword(pwd);
//		adminuserpage.clickOnTheDropdown();
//		adminuserpage.dropDown();
//		adminuserpage.clickOnSaveButton();
		boolean successpage = adminuserpage.isSuccessMessageDisplayed();
		Assert.assertTrue(successpage);

	}
}
