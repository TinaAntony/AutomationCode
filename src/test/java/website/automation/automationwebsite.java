package website.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationwebsite {
	
	public static WebDriver driver;
	@Test
	
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://tinaantony.azurewebsites.net/test1/");
		String tagh1 = driver.findElement(By.tagName("h1")).getText();
		System.out.println(tagh1);
		Assert.assertEquals(tagh1, "Tina working on Selenium Project!");
	}

}
