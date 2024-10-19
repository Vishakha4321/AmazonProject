package allpages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath = "//span[text()='Account & Lists']")
	private WebElement accountlist;
	

	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement signout;
	
	private Actions act1;
	
	public Logout(WebDriver driver) throws InterruptedException
	{
		
		PageFactory.initElements(driver, this);
		
		 act1 = new Actions(driver);
    	
	}
	public void accountandlist()
	{
		act1.moveToElement(accountlist).click().perform();
	}
	public void clickOnSignout()
	{
		act1.moveToElement(signout).click().perform();
		
	}
	
}
