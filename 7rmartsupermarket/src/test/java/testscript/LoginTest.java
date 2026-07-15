package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;



public class LoginTest extends Base{
	 
	@Test(description="Testcase is for valid credentials")
	public void verifyTheUserIsAbleToLoginwithValidusernameAndValidPassword() throws IOException 
	{

		//String usernamevalue="admin";
		//String passwordvalue="admin";
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Loginpage" );
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
		boolean homepage=loginpage.isDashboardEnabled();
		Assert.assertTrue(homepage);
		
	}
	@Test(description="Testcase is for valid username with invalid password")
	public void verifyTheUserIsAbleToLoginwithValidCredentials() throws IOException 
	{

		//String usernamevalue="admin";
		//String passwordvalue="admins";
		String usernamevalue=ExcelUtility.getStringData(2, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(2, 1, "Loginpage" );
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
		boolean alertpage1=loginpage.isInvalidLoginAlertDisplayed();
		Assert.assertTrue(alertpage1);
		
	}
	@Test(description="Testcase is for invalid username and valid password")
	public void verifyTheUserIsAbleToLoginwithInValidusernameAndValidPassword() throws IOException 
	{

		//String usernamevalue="admins";
		//String passwordvalue="admin";
		String usernamevalue=ExcelUtility.getStringData(3, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(3, 1, "Loginpage" );
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
		boolean alertpage2=loginpage.isInvalidAlertDisplayed1();
		Assert.assertTrue(alertpage2);
	}
	@Test(description="Testcase is for invalid credentials")
	public void verifyTheUserIsAbleToLoginwithInValidCredentials() throws IOException 
	{

		//String usernamevalue="admins";
		//String passwordvalue="admins";
		String usernamevalue=ExcelUtility.getStringData(4, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(4, 1, "Loginpage" );
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
		boolean alertpage3=loginpage.isInvalidAlertDisplayed2();
		Assert.assertTrue(alertpage3);
	}
	
	}

