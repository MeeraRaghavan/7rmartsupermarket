package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.Constant;
import utilities.FileUploadUtility;

public class ManageCategoryPage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and  @class='small-box-footer']")WebElement infobutton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath = "//input[@placeholder='Enter the Category']")WebElement categoryitem;
	@FindBy(xpath = "//li[@id='1-selectable']")WebElement selectgroup;
	@FindBy(xpath = "//input[@id='main_img']")WebElement uploadfile;
	@FindBy(xpath = "//button[@class='btn btn-danger']")WebElement savebutton;
	@FindBy(xpath ="//h1[@class='m-0 text-dark']")WebElement categorypagedisplay;
	@FindBy(xpath="//button[@type='button']")WebElement categoryalert;

	public ManageCategoryPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickManageCategoryInfoButton() 
	{
		infobutton.click();
	}

	public void clickNewButton() 
	{
		newbutton.click();

	}

	public void addCategoryitem(String item)
	{
		categoryitem.sendKeys(item);
	}

	public void addDiscount()
	{
		selectgroup.click();
	}

	public void uploadthefile() 
	{
		FileUploadUtility fileuploadutility = new FileUploadUtility();
		fileuploadutility.fileUploadUsingSendKeys(uploadfile, Constant.PENHOLDERIMG);
	}

	public void clickSaveButton() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", savebutton);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(savebutton));

		savebutton.click();
	}
	public boolean isCategoryPageIsDisplayed() 
	{
		 return categorypagedisplay.isDisplayed();
	}
	public boolean isCategoryAlertIsDisplayed() {
		return categoryalert.isDisplayed();
	}
}
