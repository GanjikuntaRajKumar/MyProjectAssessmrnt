package sample.eazydiner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void  test1() 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\Applications  on system\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.eazydiner.com/");
		WebElement searchBox=driver.findElement(By.id("login-btn"));
		//searchBox.sendKeys("Biryani");
		searchBox.click();
		WebElement num=driver.findElement(By.name("int-tel"));
		num.sendKeys("8297954013");
		WebElement but=driver.findElement(By.xpath("//button[contains(text(),'Get OTP')]"));
		but.click();
		driver.quit();
		

	}	
}
