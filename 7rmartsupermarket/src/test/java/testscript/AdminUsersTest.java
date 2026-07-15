package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base{
	@Test(description="Testcase is for the details of adminuser")
	public void AdminUsers() throws IOException {
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
	 
		//String username="Ziya";
		//String password="adminuser";
		AdminUsersPage adminuserspage=new AdminUsersPage(driver);
		adminuserspage.clickAdminUserinfobutton();
		adminuserspage.clickNewButton();
		String username=ExcelUtility.getStringData(0, 1, "AdminUser");
		String password=ExcelUtility.getStringData(1, 1, "AdminUser");
		adminuserspage.enterAdminUsername(username);
		adminuserspage.enterAdminPassword(password);
		adminuserspage.selectUserType();
		adminuserspage.clickSavebutton();
		boolean adminuserpagevisibility=adminuserspage.isAdminuserPageIsDisplayed();
		Assert.assertTrue(adminuserpagevisibility);
		boolean adminuseralertvisibility=adminuserspage.isAdminUserAlertDisplayed();
		Assert.assertTrue(adminuseralertvisibility);
	}

}
