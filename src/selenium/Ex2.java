package selenium;

import org.openqa.selenium.WebDriver;

public class Ex2 {
	
public static void main(String[] args) {
	
	String url= "https://www.google.co.in/";
	BaseUtility bu= new BaseUtility();
	
	WebDriver driver =bu.startup("CH", url);
	
 

 
	String Acturl =driver.getCurrentUrl();
	
	String Expturl= "https://www.goolle.co.in/";
	if(Expturl.equals(Acturl)) {
		System.out.println("correct");
	} else { System.out.println("incorrect");
	

}
}}