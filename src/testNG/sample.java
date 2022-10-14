package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;


public class sample {
  @Test
  public void f() {
	  System.out.println("manojtest");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("manoj4");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("manoj5");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("manoj3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("manoj6");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("manoj2");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("manoj7");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("manoj1");
  }


}
