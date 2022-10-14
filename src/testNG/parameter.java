package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.BaseUtility;

public class parameter {
	@Parameters({"username","password"})
	@Test
	public void add(String uname, String pwd) {
		String url= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		BaseUtility bu= new BaseUtility();
		
		WebDriver driver =bu.startup("CH", url);
		
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	 
	}
	
	 
	
}
