package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {

	public WebDriver driver;
	@FindBy(xpath = "//div[@class='small-box bg-info']//following::p[text()='Manage Footer Text']//following::a[text()='More info '][1]")
	WebElement managefooterpagemoreinfo;
	@FindBy(xpath = "//a[contains(@href,'edit=1')]")
	WebElement editbutton;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement address;
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmessage;

	public ManageFooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	public void clickOnManageFooterPageMoreInfoButton() {
//		managefooterpagemoreinfo.click();
//	}

	public ManageFooterPage clickOnEditButton() {
		editbutton.click();
		return this;
	}

	public ManageFooterPage enterTheAddress(String add) {
		address.clear();
		address.sendKeys(add);
		return this;
	}

	public ManageFooterPage enterTheEmail(String emailfeild) {
		
		email.clear();
		email.sendKeys(emailfeild);
		return this;
	}

	public ManageFooterPage enterThePhone(String phoneno) {
		phone.clear();
		phone.sendKeys(phoneno);
		return this;
	}

	public ManageFooterPage clickOnUpdateButton() {
		
		Actions a = new Actions(driver);
		a.click(updatebutton).build().perform();
		return this;
	}

	public boolean isSuccessMessageDisplayed() {
		return successmessage.isDisplayed();
	}
}