package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		List<WebElement>LinkedList=driver.findElements(By.tagName("a"));
		System.out.println("no of links: "+LinkedList.size());
		
		for(int i = 0;i<LinkedList.size();i++)
			System.out.println("Link names are: "+LinkedList.get(i).getText());
		

	}

}
