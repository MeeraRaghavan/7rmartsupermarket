package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and  @class='small-box-footer']")WebElement infobutton;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement adminusername ;
	@FindBy(xpath="//input[@type='password']")WebElement adminpassword;
	@FindBy(xpath="//select[@name='user_type']")WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")WebElement savebutton;
	@FindBy(xpath="//th[text()='Username']")WebElement adminuserpage;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement adminuseralert;
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickAdminUserinfobutton() {
		infobutton.click();
	}
	public void clickNewButton() {
		newbutton.click();
	}
	public void enterAdminUsername(String username) 
	{
		adminusername.sendKeys(username);
	}
	public void enterAdminPassword(String password)
	{
		adminpassword.sendKeys(password);
	}
	public void selectUserType() 
	{
		PageUtility pageutility=new PageUtility();
		pageutility.dropDownIndex(usertype, 3);
	
	}
	public void clickSavebutton()
	{
		savebutton.click();
	}
	public boolean isAdminuserPageIsDisplayed() {
		return adminuserpage.isDisplayed();
	}
	public boolean isAdminUserAlertDisplayed() {
		return adminuseralert.isDisplayed();
	}
	
}
