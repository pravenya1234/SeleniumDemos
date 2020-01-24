package commandsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlename_length {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		String actualname=driver.getTitle();
		System.out.println(actualname);
		System.out.println(actualname.length());
		String expectedurl="http://demowebshop.tricentis.com/login";
		String url=driver.getCurrentUrl();
		if(expectedurl.equals(url)){
			System.out.println("correct url");
		System.out.println(url);
		}
		else
			System.out.println("Incorrect url");
	
	String PageSourse=driver.getPageSource();
	System.out.println(PageSourse.length());
	driver.close();
	}
}
