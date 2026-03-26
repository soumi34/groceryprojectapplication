package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	public WebDriver driver;
	@FindBy(xpath = "//img[@class='img-circle']")
	WebElement imageicon;
	@FindBy(xpath = "//a[@class='dropdown-item'][2]")
	WebElement logoutbutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmessage;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// used to intialize Webelement,driver-local class driver,this-current
												// class driver
	}

	public void clickOnTheImageIcon() {
		imageicon.click();
	}

	public void clickOnTheLogoutButton() {
		logoutbutton.click();
	}
	public boolean isSuccessMessageDisplayed() {
		return successmessage.isDisplayed();
	}

}
