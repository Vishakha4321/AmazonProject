package baseBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	
	// browser methods 
	
	public static WebDriver launchChromeBrowser()
	{
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
	
	public static WebDriver launchEdgeBrowser()
	{
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	
	public static WebDriver launchBroswer(String targetBrowser)
	{
	WebDriver driver=null;
	if(targetBrowser.equals("Chrome"))
	{
		driver = launchChromeBrowser();
	}
	if(targetBrowser.equals("Edge"))
	{
		driver = launchEdgeBrowser();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	return driver;
	}
}
