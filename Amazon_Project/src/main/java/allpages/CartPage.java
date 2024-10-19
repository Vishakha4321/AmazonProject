package allpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	
	
	@FindBy(xpath = "//div[@id='nav-cart-count-container']")
	private WebElement cartbutton;
	
	@FindBy(xpath = "//div[@class='sc-item-content-group']")
	private WebElement producttextget;
	////div[@class='sc-list-item-content']//div[2]//span[1]
	
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement proceedtobuy;
	
    private List<String> addres;
    
	
	public CartPage(WebDriver driver) throws InterruptedException
	{
		PageFactory.initElements(driver, this);
		

		addres = new ArrayList<String>(driver.getWindowHandles());
			
		String a1= addres.get(0);
    	driver.switchTo().window(a1);
    	
    	driver.navigate().back();
		
	}
	
	
	public void clickOnCartButton()
	{
		cartbutton.click();
	}
	
	public void productverify()
	{
		String acualtext = producttextget.getText();
		System.out.println(acualtext);
		
//		String expectedtext = "Nokia 130 Music | Built-in Powerful Loud Speaker with Music Player and Wireless FM Radio | Dedicated Music Buttons | Big 2.4” Display | 1 Month Standby Battery Life | Blue";
//    	
//    	
//    	System.out.println(acualtext);
//    	if(expectedtext.equals(acualtext))
//    	{
//    		System.out.println("Test Pass");
//    	}
//    	else
//    	{
//    		System.out.println("Test Fail");
//    	}
	}
	
	public void clickOnProceedtoBuyButton()
	{
		proceedtobuy.click();
		
	}

}
