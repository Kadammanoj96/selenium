package selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class dropdowan {
	
public static void main(String[] args)  {
	
	String url= "https://demoqa.com/select-menu";
	BaseUtility bu= new BaseUtility();
	WebDriver driver =bu.startup("CH", url);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement M =driver.findElement(By.cssSelector("#withOptGroup .css-1hwfws3"));
	M.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement s =driver.findElement(By.xpath("//div[text()='Group 2, option 1']"));
	s.click();
	//System.out.println(driver.getPageSource());	
}}