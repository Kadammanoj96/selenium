package selenium;

import org.openqa.selenium.WebDriver;

public class Ex1 {
	
public static void main(String[] args) {
	
	String url= "https://demoqa.com/";
	BaseUtility bu= new BaseUtility();
	
	WebDriver driver =bu.startup("CH", url);
	
 

 
	String Acttitle =driver.getTitle();
	
	String Exptitle= "ToolQA";
	if(Exptitle.equals(Acttitle)) {
		System.out.println("correct");
	} else { System.out.println("incorrect");
	

}
}}