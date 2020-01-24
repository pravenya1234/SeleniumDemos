package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		boolean ckeckpresence=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(ckeckpresence);
		
		boolean ckeckenabled=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(ckeckenabled);
		if(ckeckpresence==true && ckeckenabled==true){
			driver.findElement(By.id("Email")).sendKeys("gpravenya97@gmail.com");
		}
		driver.close();
	}

}
