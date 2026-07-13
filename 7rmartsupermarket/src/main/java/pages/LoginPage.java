package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="//input[@class='form-control']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement invalidloginalert;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement invalidloginalert1;
	@FindBy(xpath="//i[@class='icon fas fa-ban']")WebElement invalidloginalert2;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String usernamevalue) {
		username.sendKeys(usernamevalue);
		}
	public void enterPassword(String passwordvalue) {
	password.sendKeys(passwordvalue);	
	}
	public void signin() {
		 
		    signin.click();
	}
	public boolean isDashboardEnabled() {
		return dashboard.isDisplayed();
	}
	public boolean isInvalidLoginAlertDisplayed()
	{
		return invalidloginalert.isDisplayed();
	}
	public boolean isInvalidAlertDisplayed1() 
	{
	return invalidloginalert1.isDisplayed();	
	}
	public boolean isInvalidAlertDisplayed2() {
		return invalidloginalert2.isDisplayed();
	}

}
