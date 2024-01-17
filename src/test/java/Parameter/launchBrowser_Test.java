package Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class launchBrowser_Test 
{
	WebDriver driver;
	@Test
	public void m1test()
	{
		ChromeOptions option= new ChromeOptions();
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
