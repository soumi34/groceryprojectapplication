package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUserPage {
	public WebDriver driver;
//	@FindBy(xpath = "//div[@style='background-color: !important;']//following::p[text()='Admin Users']//following::a[text()='More info '][1]")
//	WebElement adminuserpagemoreinfo;
	@FindBy(xpath = "//a[text()=' New']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//select[@name='user_type']")
	WebElement dropdown;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmessage;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// used to intialize Webelement,driver-local class driver,this-current
												// class driver
	}

//	public AdminUserPage clickOnAdminUserPageMoreInfoButton() {
//		adminuserpagemoreinfo.click();
//	}

	public AdminUserPage clickOnNewButton() {
		newbutton.click();
		return this;
	}

	public AdminUserPage enterTheUsername(String name) {
		username.sendKeys(name);
		return this;
	}

	public AdminUserPage enterThePassword(String pwd) {
		password.sendKeys(pwd);
		return this;
	}

	public AdminUserPage clickOnTheDropdown() {
		dropdown.click();
		return this;
	}

	public AdminUserPage dropDown() {
		PageUtility pageutility = new PageUtility();
		pageutility.dropDownSelectByIndex(dropdown, 2);
		return this;
	}

	public AdminUserPage clickOnSaveButton() {
		savebutton.click();
		return this;
	}

	public boolean isSuccessMessageDisplayed() {
		return successmessage.isDisplayed();
	}
}
