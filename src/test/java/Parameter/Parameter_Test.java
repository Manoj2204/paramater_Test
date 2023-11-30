package Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void config_BeforeMethod()
	{
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		if (browser.equalsIgnoreCase("chrome")) 
		{
			driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();	
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void config_AfterMethod()
	{
		driver.manage().window().minimize();
		driver.close();
	}
	
	@Test
	public void test()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}

}
