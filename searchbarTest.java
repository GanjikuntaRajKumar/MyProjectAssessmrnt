package sample.eazydiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class searchbarTest {
	@Test
	public void test2() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\Applications  on system\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.eazydiner.com/");
		WebElement searchBox=driver.findElement(By.id("home-search"));
		searchBox.sendKeys("Barbique nation");
		driver.quit();


	}

}
