package pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

	public class ManageNewsPage {
		public WebDriver driver;
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and  @class='small-box-footer']")WebElement infobutton;
		@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
		@FindBy(xpath="//textarea[@id='news']")WebElement textarea;
		@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
		@FindBy(xpath="//p[text()='Manage News']")WebElement managenewspage;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement managenewsalert;
		public ManageNewsPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void clickManageNewsInfoButton()
	
		{
			PageUtility pageutility=new PageUtility();
			pageutility.scrollIntoView(driver, infobutton);
			infobutton.click();
		}
		
		public void clickNewButton() 
		{
		newbutton.click();	
		}
		public void enterNews(String newsfield)
		{
		textarea.sendKeys(newsfield);	
		}
		public void clickSaveButton()
		{
		savebutton.click();	
		}
		public boolean isManageNewsPageIsDisplayed() {
			return managenewspage.isDisplayed();
		}
		public boolean isManageNewsAlertDisplayed() {
			return managenewsalert.isDisplayed();
		}

	}


