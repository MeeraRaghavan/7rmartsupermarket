package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base{
	@Test
	public void enterCategoryItem() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(1, 0, "Loginpage");
		String passwordvalue=ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernamevalue);
		loginpage.enterPassword(passwordvalue);
		loginpage.signin();
		//String item="PenHolder";
		//String filepath="C:\\Users\\Meera Raghavan\\Desktop\\images.jfif";
	ManageCategoryPage pagecategory=new ManageCategoryPage(driver);
	FakerUtility faker=new FakerUtility();
	String item=faker.generateCategory();
	pagecategory.clickManageCategoryInfoButton();
	pagecategory.clickNewButton();
	//String item=ExcelUtility.getStringData(0, 0, "ManageCategory");
	pagecategory.addCategoryitem(item);
	pagecategory.addDiscount();
	pagecategory.uploadthefile();
	pagecategory.clickSaveButton();
	boolean categorypagevisibility=pagecategory.isCategoryPageIsDisplayed();
	Assert.assertTrue(categorypagevisibility);
	boolean categoryalertvisibility=pagecategory.isCategoryAlertIsDisplayed();
	Assert.assertTrue(categoryalertvisibility);
	
}
}
