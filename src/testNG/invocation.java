package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import selenium.BaseUtility;

public class invocation {
	@Test(invocationCount=3, threadPoolSize=2)
	public void add() {
		String url= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		BaseUtility bu= new BaseUtility();
		
		WebDriver driver =bu.startup("CH", url);
		
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	 
	}
	
}
