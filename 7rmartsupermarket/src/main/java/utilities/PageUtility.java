package utilities;



	import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class PageUtility {
		public void dropDownVisibleText(WebElement elementname,String visibletext)
		{
			Select select=new Select(elementname);
			select.selectByVisibleText(visibletext);
			
		}
	public void dropDownValue(WebElement elementname,String value)
	{
		Select select=new Select(elementname);
		select.selectByValue(value);
	}
	public void dropDownIndex(WebElement elementname,int index)
	{
		Select select=new Select(elementname);
		select.selectByIndex(index);
	}
	//ACTIONCLASS
	public void dragAndDrop(WebDriver driver,WebElement drag,WebElement drop)
	{
		Actions obj=new Actions(driver);
		obj.dragAndDrop(drag, drop).perform();
		
	}
	public void mouseHover(WebDriver driver,WebElement elementname)
	{
		Actions obj=new Actions(driver);	
		obj.moveToElement(elementname).perform();
	}
	public void rightClick(WebDriver driver,WebElement elementname)
	{
		Actions obj=new Actions(driver);
		obj.click(elementname).perform();
	}
	public void doubleClick(WebDriver driver,WebElement elementname) 
	{
		Actions obj=new Actions(driver);
		obj.doubleClick(elementname).perform();
	}
	public void click(WebDriver driver,WebElement elementname) 
	{
		Actions obj=new Actions(driver);
		obj.click(elementname).perform();
	}
	//INPUTFORM
	public void form(WebDriver driver,WebElement elementname,String value)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='value';",elementname);
		js.executeScript("argument[0].click();",elementname);
	}
	//PAGESCROLL
	public void pagescrollBy(WebDriver driver, int x,int y)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(arguments[0],arguments[1];",x,y);
		
	}
	public void scrollIntoView(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

	
	public void scrollToBottom(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	public void scrollToTop(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollT(0,0)," );
	}
	//EXPLICITWAIT
	  public void waitForElementToBeVisible(WebDriver driver, WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    }

	    
}
