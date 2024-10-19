package childpage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class firstproductpage {
	
	@FindBy (xpath = "//li[@id='color_name_0']")
	private WebElement mobilecolor;
	
	@FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")
	private WebElement addtocart;
	
	@FindBy(xpath = "//a[@id='attach-close_sideSheet-link']")
	private WebElement canclePopUp;
	
	private List<String> addres;
	
	public firstproductpage(WebDriver driver) throws InterruptedException
	{
		PageFactory.initElements(driver, this);
		

//		addres = new ArrayList<String>(driver.getWindowHandles());
//		String a2= addres.get(1);		
//		driver.switchTo().window(a2);
//		Thread.sleep(2000);
//		
//		String a1= addres.get(0);
//    	driver.switchTo().window(a1);
		
	}

	public void selectmobilecolor()
	{
		mobilecolor.click();
	}
	
	public void productaddtocart()
	{
		addtocart.click();
		
	}
	public void clickOnCanclePopupPage()
	{
		canclePopUp.click();
	}
}
