package selenium;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {
	public void scrollByJS(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
	}
	
	public void clickByJS(WebDriver driver ,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click()", ele);
	}
	
	public WebDriver startup(String browserName,String url) {
		WebDriver driver= null;
		if(browserName.equalsIgnoreCase("CH")|| browserName.equalsIgnoreCase("CHROME")) {
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions Option = new ChromeOptions();
			Option.addArguments("start-maximized");
			Option.addArguments("--disable-notifications");
			driver = new ChromeDriver(Option);
			driver.get(url);
		} else {
			System.out.println("invalid browser");
		}
		return driver;
		
	}
	
	
	
	

}
