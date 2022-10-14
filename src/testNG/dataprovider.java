package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import selenium.BaseUtility;

public class dataprovider {
	@Test(dataProvider="login")
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
	
	@DataProvider
	public Object [][] login(){
		Object [][] data = new Object [3][2];
		data [0][0] = "admin";
		data [0][1] = "admin123";
		
		data [1][0]= "admin";
		data [1][1]= "admin234";
		
		data[2][0] = "admin";
		data[2][1] = "asmin123";
		return data;
	}
}
