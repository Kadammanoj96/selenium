package selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Ex4 {
	
public static void main(String[] args)  {
	
	String url= "https://demoqa.com/radio-button";
	BaseUtility bu= new BaseUtility();
	WebDriver driver =bu.startup("CH", url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement rdbtn = driver.findElement(By.xpath("//div[@class='main-header']"));
	String M =rdbtn.getText();
	
	System.out.println(M);
	/*
	 * System.out.println(rdbtn.isEnabled());
	 * 
	 * System.out.println(rdbtn.isSelected());
	 * System.out.println(rdbtn.isDisplayed());
	 */
}
}