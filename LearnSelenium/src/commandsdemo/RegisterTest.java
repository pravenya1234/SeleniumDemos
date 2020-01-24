package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("sunil");
		driver.findElement(By.id("LastName")).sendKeys("kumar");
		driver.findElement(By.id("Email")).sendKeys("kumar123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sunil123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sunil123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		

	}

}
