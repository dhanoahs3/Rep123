package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
public class Yahootest {
	
	  @BeforeTest
	  public void beforeTest()  {
		  System.out.println("Before the Test of Yahoo");
		  //If we want to skip an entire test that is all its methods in @Test simply type the below command
	  //throw new SkipException("Dont want to run this test");
	  }
	  
	  @AfterTest
	  public void AfterTest() {
		  System.out.println("After the Test of Yahoo");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before the method of Yahoo");
	  }
	  
	  @AfterMethod
	  public void AfteTest() {
		  System.out.println("After the method of Yahoo");
	  }
	 @Test
	  public void yahootest() {
		 System.out.println("In yahootest");
	  }
	 
	 
	  
}
