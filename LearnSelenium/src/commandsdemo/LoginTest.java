package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
		//System.setProperty("webdriver.gecko.driver","D:\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.id("Email")).sendKeys("gpravenya97@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Pravenya@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String expectedname="Demo Web Shop";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		
		if(expectedname.equals(actualname))
			System.out.println("U are on the correct page");
		else
			System.out.println(" Incorrect page");
		
		driver.close();
	}
}
