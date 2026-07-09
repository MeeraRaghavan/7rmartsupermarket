package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePagesPage;
import utilities.ExcelUtility;

public class ManagePagesTest extends Base {
	@Test(retryAnalyzer=retry.Retry.class)
public void managePage() throws IOException
{
	String usernamevalue=ExcelUtility.getStringData(1, 0, "Loginpage");
	String passwordvalue=ExcelUtility.getStringData(1, 1, "Loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(usernamevalue);
	loginpage.enterPassword(passwordvalue);
	loginpage.signin();
	ManagePagesPage managepage=new ManagePagesPage(driver);
	managepage.clickManagepagesMoreInfo();
	managepage.clickManagepageNewButton();
	String title=ExcelUtility.getStringData(0, 1, "ManagePage");
	String description=ExcelUtility.getStringData(3, 1,"ManagePage");
	String page=ExcelUtility.getStringData(2, 1, "ManagePage");
	managepage.addTitleToTheField(title);
	managepage.addDescriptionToTheField(description);
	managepage.enterpagenameToTheField(page);
	managepage.addToTheChoosefile();
	managepage.clicksavebutton();
	boolean managepagevisibility=managepage.isManagePageIsDisplayed();
	Assert.assertTrue(managepagevisibility);
	boolean managepagealert=managepage.isManagePageAlertIsDisplayed();
	Assert.assertTrue(managepagealert);
	
	
}
}
