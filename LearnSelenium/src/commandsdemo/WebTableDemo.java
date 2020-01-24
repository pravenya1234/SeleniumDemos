package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:///D:/Softwares%20Required%20For%20Testing%20Batch/Tools.html");
		String text=driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
	}

}
