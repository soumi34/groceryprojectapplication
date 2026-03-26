package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {

	public WebDriver driver;
//	@FindBy(xpath = "//div[@class='small-box bg-info']//following::p[text()='Manage Contact']//following::a[text()='More info '][1]")
//	WebElement managecontactpagemoreinfo;
	@FindBy(xpath = "//a[@role='button']")
	WebElement updatebutton;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement address;
	@FindBy(xpath = "//textarea[@name='del_time']")
	WebElement deltime;
	@FindBy(xpath = "//input[@name='del_limit']")
	WebElement dellimit;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement submit;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmessage;

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	public void clickOnManageContactPageMoreInfoButton() {
//		managecontactpagemoreinfo.click();
//	}

	public ManageContactPage clickOnUpdateButton() {
		updatebutton.click();
		return this;
	}

	public ManageContactPage clickOnThePhoneField(String phonefeild, String emailfeild,String add,String deltim,String dellim) {
		phone.clear();
		phone.sendKeys(phonefeild);
		email.clear();
		email.sendKeys(emailfeild);
		address.clear();
		address.sendKeys(add);
		deltime.clear();
		deltime.sendKeys(deltim);
		dellimit.clear();
		dellimit.sendKeys(dellim);
		return this;
	}

	public ManageContactPage clickOnTheSubmitButton() {
		//submit.click();
		Actions a = new Actions(driver);
		a.click(submit).build().perform();
		return this;
	}

	public boolean isSuccessMessageDisplayed() {
		return successmessage.isDisplayed();
	}

}
