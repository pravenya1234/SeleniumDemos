package commandsdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_jpg");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		StringSelection stringselect=new StringSelection("D:\\ISTB\tryqa.com-ISTQB-Dumps-and-Mock-Tests-for-Foundation-Level-Paper-1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
