package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoautoregister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pravenya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gonuguntla");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("jfhggfwegffgffgfg");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("gpravenya97@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("453454544");
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Movies']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Hockey']")).click();
		WebElement skill=driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		Select s=new Select(skill);
		s.selectByVisibleText("C");
		Select se = new Select(driver.findElement(By.xpath("//select[@ng-model='Skill']")));
		List<WebElement>l=se.getOptions();
		System.out.println("skills list size :"+l.size());
		for(int i = 0;i<l.size();i++)
			System.out.println("skills names are :"+l.get(i).getText());
		WebElement country=driver.findElement(By.xpath("//select[@ng-model='country']"));
		Select s1=new Select(country);
		s1.selectByVisibleText("India");
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sell=new Select(year);
		sell.selectByVisibleText("1997");
		WebElement month=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select sell1=new Select(month);
		sell1.selectByVisibleText("August");
		List<WebElement>l2=sell1.getOptions();
		System.out.println("months list size :"+l2.size());
		WebElement date=driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		Select sell3=new Select(date);
		sell3.selectByVisibleText("7");
		driver.findElement(By.id("firstpassword")).sendKeys("Pravenya@123");
		driver.findElement(By.id("secondpassword")).sendKeys("Pravenya@123");
		driver.findElement(By.id("submitbtn")).click();
		driver.navigate().forward();
		driver.navigate().to("http://demo.automationtesting.in/WebTable.html");
		//driver.findElement(By.id("Button1")).click();
		//driver.navigate().refresh();
		
	}

}
