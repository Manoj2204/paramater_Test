package Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parameter_Test 
{
	public static WebDriver driver;
	
	//@BeforeMethod
	@Test
	public void BeforeMethod()
	{
		String browser = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		if (browser.equalsIgnoreCase("chrome")) 
		{
			driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();	
		}
		driver.get(URL);
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
