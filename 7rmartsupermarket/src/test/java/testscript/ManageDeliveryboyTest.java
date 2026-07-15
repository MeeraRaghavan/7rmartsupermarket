package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryboyPage;
import utilities.ExcelUtility;

public class ManageDeliveryboyTest extends Base{
	@Test(description="Testcase for manage delivery boy")
	public void manageDeliveryboy() throws IOException {
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
		ManageDeliveryboyPage deliveryboy=new ManageDeliveryboyPage(driver);
		deliveryboy.clickDeliveryboyMoreInfoButton();
		deliveryboy.clickNewbuttonDeliveryboy();
		String addname=ExcelUtility.getStringData(0, 1, "ManageDeliveryboy");
		String addemail=ExcelUtility.getStringData(1, 1, "ManageDeliveryboy");
		int addphonenumber=ExcelUtility.getIntegerData(2, 1, "ManageDeliveryboy");
		String addaddress=ExcelUtility.getStringData(3, 1,"ManageDeliveryboy");
		String addusername=ExcelUtility.getStringData(4, 1,"ManageDeliveryboy");
		String addpassword=ExcelUtility.getStringData(5, 1,"ManageDeliveryboy");
		deliveryboy.enternName(addname);
		deliveryboy.enterTheEmailAdd(addemail);
		deliveryboy.enterThePhonenumber(addphonenumber);
		deliveryboy.enterTheAddress(addaddress);
		deliveryboy.enterTheUsername(addusername);
		deliveryboy.enterpassword(addpassword);
		deliveryboy.clickSavebutton();
		boolean deliveryboypagevisibility=deliveryboy.isDeliverboyPageIsDisplayed();
		Assert.assertTrue(deliveryboypagevisibility);
		boolean deliveryboypagealertvisibility=deliveryboy.isDeliveryBoyPageAlertDisplayed();
		Assert.assertTrue(deliveryboypagealertvisibility);
	}

}
