package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-register")).click();
		driver.navigate().forward();
		driver.navigate().to("http://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
