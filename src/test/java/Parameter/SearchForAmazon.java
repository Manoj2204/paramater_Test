package Parameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchForAmazon 
{
	@Test
	public void Amazon_Test()
	{
		ChromeOptions option= new ChromeOptions();
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement searchTBx = driver.findElement(By.xpath("//textarea[@name='q']"));
		searchTBx.sendKeys("https://www.amazon.in/");
		searchTBx.sendKeys(Keys.ENTER);
		WebElement amazonLink = driver.findElement(By.xpath("//h3[text()='Amazon.in']"));
		Actions action=new Actions(driver);
		action.moveToElement(amazonLink).click().perform();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Amazon.in"));
		String amazonTitle = driver.getTitle();
		System.out.println(amazonTitle);
		driver.quit();
	}

}
