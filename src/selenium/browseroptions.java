package selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class browseroptions {
	
public static void main(String[] args) throws InterruptedException  {
	
	String url= "https://demoqa.com/select-menu";
	BaseUtility bu= new BaseUtility();
	WebDriver driver =bu.startup("CH", url);
	driver.navigate().to("https://www.google.co.in/");
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.navigate().forward();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	
	
}
}