package selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class DRAGDROP {

	public static void main(String[] args)  {

		String url= "https://demoqa.com/droppable";
		BaseUtility bu= new BaseUtility();

		WebDriver driver =bu.startup("CH", url);
		Actions act = new Actions(driver);
		WebElement drag1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop1 = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		bu.scrollByJS(driver, drop1);
		
//act.dragAndDrop(drag1, drop1).perform();

       //  act.dragAndDropBy(drag1, 250,120).perform();
		
		act.click(drag1).clickAndHold(drag1).moveToElement(drop1).release().build().perform();

		



	}
}