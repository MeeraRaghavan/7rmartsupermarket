package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;


public class ManageNewsTest extends Base {
	@Test(retryAnalyzer=retry.Retry.class)
	public void enterNewsOnManageNewsField() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
	managenewspage.clickManageNewsInfoButton();
	managenewspage.clickNewButton();
	String newsfield=ExcelUtility.getStringData(0, 0, "EnterNews");
    managenewspage.enterNews(newsfield);
	managenewspage.clickSaveButton();
	boolean managenewspagevisibility=managenewspage.isManageNewsPageIsDisplayed();
	Assert.assertTrue(managenewspagevisibility);
	
	boolean managenewsalertvisibility=managenewspage.isManageNewsAlertDisplayed();
	Assert.assertTrue(managenewsalertvisibility);
	}

}
