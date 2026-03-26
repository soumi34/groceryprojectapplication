package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;

public class ManageCategoryPage {

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	@FindBy(xpath = "//div[@class='small-box bg-info']//following::p[text()='Manage Category']//following::a[text()='More info '][1]")
	WebElement managecategorypagemoreinfo;
	@FindBy(xpath = "//a[text()=' New']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@placeholder='Enter the Category']")
	WebElement category;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement discountbutton;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement choosefile;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successmessage;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	public void clickOnManageCategoryPageMoreInfoButton() {
//		managecategorypagemoreinfo.click();
//	}

	public ManageCategoryPage clickOnNewButton() {
		newbutton.click();
		return this;
	}

	public ManageCategoryPage enterTheCategory(String field) {
		category.sendKeys(field);
		return this;
	}

	public ManageCategoryPage clickOnTheDiscountButton() {
		discountbutton.click();
		return this;
	}

	public ManageCategoryPage clickOnTheFile()

	{
		fileuploadutility.fileUploadUsingSendKeys(choosefile, Constant.IMAGE);
		return this;
	}

	public ManageCategoryPage clickOnSaveButton() {
		Actions a = new Actions(driver);
		a.click(savebutton).build().perform();
		// savebutton.click();
		return this;
	}

	public boolean isSuccessMessageDisplayed() {
		return successmessage.isDisplayed();
	}
}
