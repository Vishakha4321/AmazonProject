package amazonTestClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import allpages.CartPage;
import allpages.Login;
import allpages.SearchItems;
import baseBrowser.Browser;
import childpage.firstproductpage;

public class ValidateCartAndBuy extends Browser{
	
	
	private WebDriver driver;
	private Login login;
	private SearchItems searchItems;
	private List<String> addres ;
	private firstproductpage firstProductDetailPage;
	private CartPage cartPage;
	
	@Parameters("browser")
	@BeforeTest
	void openBrowser(String expectedBrowser)
	{
		System.out.println(expectedBrowser);
		

		
		driver = launchBroswer(expectedBrowser);
		

	}
	
	
	@BeforeClass
	void initializePOM() throws InterruptedException
	{
		// Browser launch
		//driver = new ChromeDriver();
		
		
		searchItems = new SearchItems(driver);
		firstProductDetailPage = new firstproductpage(driver);
		cartPage = new CartPage(driver);
		
	}
	
	@BeforeMethod
	void urlHit(){
		driver.get("https://www.amazon.in/");
		login = new Login(driver);
		
		
	}
	
	@Test
	void LoginPage() throws InterruptedException
	{
//		login.clickOnLoginButton();
//		login.sendUserName("9601433728");
//		login.clickContinue();
//		login.enterPass("vishu@4321");
//		login.clickSignInButton();
		
//		searchItems = new SearchItems(driver);  //declared in before class 
		searchItems.enterproductname("mobile phones");
		searchItems.movetothirdproduct();
		
		searchItems.clickOnfirstProduct();
		
//     ChildBrowserPage
		 addres = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addres.get(1));
		
//		 firstProductDetailPage = new firstproductpage(driver); //declared in before class 
		//firstProductDetailPage.selectmobilecolor();
		
		Thread.sleep(3000);
		firstProductDetailPage.productaddtocart();
		
		Thread.sleep(3000);
		firstProductDetailPage.clickOnCanclePopupPage();
		
		driver.switchTo().window(addres.get(0));
		
//		cartPage = new CartPage(driver); //declared in before class 
		cartPage.clickOnCartButton();
		
		String actualtext = "Shopping Cart";
		String expectedText ="Shopping Cart";
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualtext, expectedText);
		softAssert.assertAll();
		
		cartPage.productverify();
		
		
		cartPage.clickOnProceedtoBuyButton();
		
		
	}
	
//	@Test
//	void searchItemsPage()
//	{
//		
//	}
	
	
	
	@AfterMethod
	void logout() 
	{
		//driver.close();
	}
	
	
	

}