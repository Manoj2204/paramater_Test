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

	@BeforeMethod
	public void BeforeMethod() {
		String browser = System.getProperty("Browser");
		String url = System.getProperty("Url");

		if (browser.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
		}
		driver.get(url);
		

	}

	@AfterMethod
	public void AfterMethod() {
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
