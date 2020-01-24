package commandsdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		String handle=driver.getWindowHandle();
		System.out.println("window handle :"+handle);
		
		WebElement tabWindow=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		tabWindow.click();
		
		Set<String>windowids=driver.getWindowHandles();
		
		Iterator<String>iter=windowids.iterator();
		
		String mainWindow=iter.next();
		
		String childWindow=iter.next();
		
		driver.switchTo().window(childWindow);
		System.out.println("The title of thecurrent window : "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(mainWindow);
		
		System.out.println("The title of thecurrent window : "+driver.getTitle());
		
		driver.close();
	}

}
