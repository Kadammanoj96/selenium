package selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class dropdowan2 {
	
public static void main(String[] args)  {
	
	String url= "https://demoqa.com/select-menu";
	BaseUtility bu= new BaseUtility();
	WebDriver driver =bu.startup("CH", url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement ele = driver.findElement(By.id("oldSelectMenu"));
	bu.scrollByJS(driver, ele);
	ele.click();
	driver.findElement(By.xpath("//option[ text()='White']")).click();
	
	
	
	
	
	
	
	
	
}
}