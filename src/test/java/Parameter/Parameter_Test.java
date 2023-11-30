package Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter_Test 
{
	WebDriver driver;
	
	//@BeforeMethod
	@Test
	public void BeforeMethod()
	{
		String browser = System.getProperty("Browser");
		String url = System.getProperty("Url");
		
		if (browser.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver();
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();	
		}
		driver.get(url);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	/*
	 * @AfterMethod public void AfterMethod() { driver.manage().window().minimize();
	 * driver.close(); }
	 * 
	 * @Test public void test() { String title = driver.getTitle();
	 * System.out.println(title); }
	 */
}
