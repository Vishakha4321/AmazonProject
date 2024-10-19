package allpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchItems {
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement productSearch;
	
	@FindBy (xpath = "(//div[@class='s-suggestion-container'])[3]")
	private WebElement thirdproductselect;
	
	@FindBy (xpath = "(//div[@data-cy='image-container'])[1]")
	private WebElement firstProduct;
	
	private Actions act;
	
	public SearchItems(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		 act = new Actions(driver);
	}
	
	public void enterproductname(String productName)
	{
		productSearch.sendKeys(productName);
		productSearch.click();
		//firstProduct.click();
	}
	
	public void movetothirdproduct()
	{
		act.moveToElement(productSearch).perform();
		act.moveToElement(thirdproductselect).perform();
		act.click().perform();
	}
	
	public void clickOnfirstProduct() {
		firstProduct.click();
	}

}
