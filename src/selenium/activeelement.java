package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class activeelement {
	
public static void main(String[] args) throws InterruptedException  {
	
	String url= "https://www.facebook.com/home.php";
	BaseUtility bu= new BaseUtility();
	
	WebDriver driver =bu.startup("CH", url);
	Thread.sleep(3000);
	

driver.switchTo().activeElement().sendKeys("");
driver.switchTo().activeElement().sendKeys(Keys.TAB);
driver.switchTo().activeElement().sendKeys("");
driver.switchTo().activeElement().sendKeys(Keys.TAB);	
driver.switchTo().activeElement().sendKeys(Keys.TAB);
driver.switchTo().activeElement().click();
}
}