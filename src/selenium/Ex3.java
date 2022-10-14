package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Ex3 {
	
public static void main(String[] args)  {
	
	String url= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	BaseUtility bu= new BaseUtility();
	
	WebDriver driver =bu.startup("CH", url);
	
	//Thread.sleep(10000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
 driver.findElement(By.xpath("//button[@type='submit']")).click();
// WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
	//wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"))));
//System.out.println(driver.getPageSource());
System.out.println(driver.getWindowHandle());

 driver.quit();
 
	

}
}