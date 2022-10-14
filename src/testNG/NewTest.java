package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("4");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("5");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("6");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("2");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("7");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("8");
  }

}
