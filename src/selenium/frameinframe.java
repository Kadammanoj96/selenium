package selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class frameinframe {
	
public static void main(String[] args) throws InterruptedException  {
	
	String url= "https://demoqa.com/frames";
	BaseUtility bu= new BaseUtility();
	WebDriver driver =bu.startup("CH", url);
    driver.switchTo().frame("frame1");
	WebElement windo1 = driver.findElement(By.id("sampleHeading"));
	System.out.println(windo1.getText());
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame2");
	WebElement windo2 = driver.findElement(By.id("sampleHeading"));
	System.out.println(windo2.getText());
}
}