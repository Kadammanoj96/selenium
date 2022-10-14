package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class filereader {
	
public static void main(String[] args) throws IOException   {
	
	

FileInputStream fis = new FileInputStream("./resources/config.properties");
	
	Properties prop = new Properties();
	prop.load(fis);
	String url = prop.getProperty("url");
	String broser = prop.getProperty("browserName");
	String uname = prop.getProperty("username");
	String pwd = prop.getProperty("password");

	
	BaseUtility bu= new BaseUtility();
	WebDriver driver =bu.startup(broser,url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
 driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}