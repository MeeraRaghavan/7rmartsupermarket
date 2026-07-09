package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryboyPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy' and @class='small-box-footer']")WebElement deliveryboymoreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbuttondeliveryboy;
	@FindBy(xpath="//input[@name='name']")WebElement entername ;
	@FindBy(xpath="//input[@type='email']")WebElement enteremail;
	@FindBy(xpath="//input[@id='phone']")WebElement enterphonenumber ;
	@FindBy(xpath="//textarea[@id='address']")WebElement enteraddress;
	@FindBy(xpath="//input[@name='username']")WebElement enterusername;
	@FindBy(xpath="//input[@name='password']")WebElement enterpassword ;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement entersavebutton;
	@FindBy(xpath="//h3[text()='Enter Delivery Boy Informations']")WebElement deliveryboypagevisibility;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement deliveryboypagealert;
	public ManageDeliveryboyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickDeliveryboyMoreInfoButton() 
	{
		deliveryboymoreinfo.click();	
	}
	public void clickNewbuttonDeliveryboy() {
		newbuttondeliveryboy.click();
	}
public void enternName(String addname)
{
	entername.sendKeys(addname);
}
public void enterTheEmailAdd(String addemail) 
{
	enteremail.sendKeys(addemail);
}
public void enterThePhonenumber(int addphonenumber) {
	enterphonenumber.sendKeys(String.valueOf(addphonenumber));
}
public void enterTheAddress(String addaddress) {
	enteraddress.sendKeys(addaddress);
}
public void enterTheUsername(String addusername) {
	enterusername.sendKeys(addusername);
}
public void enterpassword(String addpassword)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", enterpassword);
	enterpassword.sendKeys(addpassword);
}
public void clickSavebutton()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", entersavebutton);
    entersavebutton.click();
}
public boolean isDeliverboyPageIsDisplayed() {
	return deliveryboypagevisibility.isDisplayed();
}
public boolean isDeliveryBoyPageAlertDisplayed() {
	return deliveryboypagealert.isDisplayed();
	
}
}
