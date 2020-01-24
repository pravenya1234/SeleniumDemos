package commandsdemo;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(Log4jDemo.class);
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		
		log.info("application started successfully");
		
		String expectedResult="google";
		
		String actualResult=driver.getTitle();
		log.warn("check title");
		
		if(expectedResult.equals(actualResult)){
			System.out.println("Correct page");
			log.info("correct page");
			driver.close();
		}
		else{
			System.out.println("Incorrect page");
			log.error("incorrect title");
			driver.close();
		}
			
	

	}

}
