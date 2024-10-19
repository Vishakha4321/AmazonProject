package allpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





			// POM Class
public class Login {
	
//------------------ Variable Declaration -> Private
	
	@FindBy (xpath="//span[text()='Account & Lists']") 
	private WebElement aacountandlist;
	
	@FindBy (xpath="//div[@id='nav-al-signin']//span[text()='Sign in']") 
	private WebElement SignIn;
	
	@FindBy (xpath="//input[@id='ap_email']") 
	private WebElement userName;
	
	@FindBy (xpath="//span[@id='continue']") 
	private WebElement continueButton;
	
	@FindBy (xpath="//input[@id='ap_password']") 
	private WebElement password;
	
	@FindBy (xpath="//input[@id='signInSubmit']") 
	private WebElement signInButton;
	
	private Actions action;
	
// -------Variable Initialization -> Public Constructor => PageFactory
	
	public Login (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		action= new Actions(driver);
	}
	
	

//--------Variable Use => Public Method
	
//	public void clickAccountandList()
//	{
//		aacountandlist.click();
//	}
//	
	public void clickOnLoginButton()
	{
		action.moveToElement(aacountandlist).moveToElement(SignIn).click().build().perform();
	}
	
	public void sendUserName(String userID)
	{
		userName.sendKeys(userID);
	}
	
	public void clickContinue()
	{
		continueButton.click();
	}
	
	public void enterPass(String userPassword)
	{
		password.sendKeys(userPassword);
	}
	
	public void clickSignInButton()
	{
		signInButton.click();
	}
	
}
