package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;

public class ManagePagesPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and  @class='small-box-footer']")WebElement managepagesmoreinfo ;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement managepagenewbutton;
@FindBy(xpath="//input[@name='title']")WebElement addtitle;
@FindBy(xpath="//div[@class='note-editable card-block']")WebElement adddescription;
@FindBy(xpath="//input[@id='page']")WebElement enterpagename;
@FindBy(xpath="//input[@name='main_img']")WebElement choosefile ;
@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
@FindBy(xpath="//button[text()='Save']")WebElement checkmanagepagedisplay;
@FindBy(xpath="//i[@class='icon fas fa-ban']")WebElement managepagealert;

public ManagePagesPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void clickManagepagesMoreInfo() {
	managepagesmoreinfo.click();
}
public void clickManagepageNewButton()
{
	managepagenewbutton.click();
}
public void addTitleToTheField(String title) {
	addtitle.sendKeys(title);
}
public void addDescriptionToTheField(String description) {
	adddescription.click();
	adddescription.sendKeys(description);
}
public void enterpagenameToTheField(String page) {
	enterpagename.sendKeys(page);
}
public void addToTheChoosefile() {
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	fileuploadutility.fileUploadUsingSendKeys(choosefile, Constant.ABOUTPAGE);
}
public void clicksavebutton() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", savebutton);
	savebutton.click();
}
public boolean isManagePageIsDisplayed() {
	return checkmanagepagedisplay.isDisplayed();
}
public boolean isManagePageAlertIsDisplayed() {
	return managepagealert.isDisplayed();
}
}
