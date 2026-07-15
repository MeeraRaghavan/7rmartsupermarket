package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;

public class LogOutTest extends Base {
	@Test(description="Testcase for logout")
	public void verifyUserCanLogoutSuccessfullyFromDashboard()
	{
		String usernamevalue="admin";
		String passwordvalue="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
		LogoutPage logoutpage=new LogoutPage(driver);
		logoutpage.clickOnAdminButton();
		logoutpage.clickOnButton();
		boolean logoutpageverify=logoutpage.isLogoutpageIsDisplayed();
		Assert.assertTrue(logoutpageverify);
		
	}
	}



