package Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchBrowser_Test 
{
	WebDriver driver;
	@Test
	public void m1test()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
