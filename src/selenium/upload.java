package selenium;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class upload {
	
public static void main(String[] args) throws InterruptedException  {
	
	String url= "https://demoqa.com/upload-download";
	BaseUtility bu= new BaseUtility();
	WebDriver driver =bu.startup("CH", url);
   
  WebElement manoj = driver.findElement(By.xpath("//input[@class='form-control-file']"));
  bu.scrollByJS(driver, manoj);
  manoj.sendKeys("E:\\New Text Document.txt");
}
}