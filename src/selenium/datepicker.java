package selenium;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class datepicker {
	
public static void main(String[] args) throws InterruptedException  {
	
	String url= "https://demoqa.com/automation-practice-form";
	BaseUtility bu= new BaseUtility();
	WebDriver driver =bu.startup("CH", url);
   
    Actions act = new Actions(driver);
    WebElement date = driver.findElement(By.id("dateOfBirthInput"));
    bu.scrollByJS(driver, date);
    act.click(date).perform();
   
    WebElement year = driver.findElement(By.xpath("//option[@value='1996']"));
    year.click();
    
    WebElement month = driver.findElement(By.xpath("//option[@value='3']"));
    month.click();
    
    WebElement date1 = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--004']"));
    date1.click();
   
}
}