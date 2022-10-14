package selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class actionclass {

	public static void main(String[] args)  {

		String url= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		BaseUtility bu= new BaseUtility();

		WebDriver driver =bu.startup("CH", url);


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);

		WebElement username1 = driver.findElement(By.xpath("//input[@name='username']"));
		act.sendKeys(username1,"Admin").perform();

		WebElement username2 = driver.findElement(By.xpath("//input[@name='password']"));
		act.sendKeys(username2,"admin123").perform();

		driver.findElement(By.xpath("//button[@type='submit']")).click();


		



	}
}