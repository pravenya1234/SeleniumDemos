package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/WebTable.html");
		
		driver.manage().window().maximize();
		//backward menu select register
		//driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Register')]")).click();
		//forward menu select switch to
		driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li/following-sibling::li[1]//a[contains(text(),'SwitchTo')]")).click();
		//for demo web shop website
		//driver.findElement(By.xpath("//a[contains(text(),'Computers')]//parent::li//parent::ul//child::li//a[contains(text(),'Electronics')]")).click();
		//by using ancestors we can do directly
		////a[contains(text(),'SwitchTo')]//parent::li//ancestor::li//preceding-sibling::li//a[contains(text(),'WebTable')]
		//*[@class='nav navbar-nav']//descendant::a
	}

}
