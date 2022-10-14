package selenium;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class alert {
	
public static void main(String[] args) throws InterruptedException  {
	
	String url= "https://demoqa.com/alerts";
	BaseUtility bu= new BaseUtility();
	WebDriver driver =bu.startup("CH", url);
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
    Alert alt = driver.switchTo().alert();
    System.out.println(alt.getText());
    alt.accept();
    driver.findElement(By.id("confirmButton")).click();
    System.out.println(alt.getText());
    alt.dismiss();
    
    WebElement ele =driver.findElement(By.id("promtButton"));
    bu.scrollByJS(driver, ele);
    ele.click();
    alt.sendKeys("manoj is legend");
    Thread.sleep(2000);
    alt.accept();
    
    WebElement ele2 =driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
    ele2.click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.alertIsPresent());
    System.out.println(alt.getText());
    alt.accept();
    
}
}