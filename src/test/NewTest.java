package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
//Now to make this class what we did was go on src folder ->right click->New->Other->
//TestNg->choose src folder after browsing to Module 9 and give a package name like "test"
//and selecting BeforeMethod and BeforeTest from the list of methods below.
/*
 * All thes annotation functions have special meaning
 * Only thing matters is the annotation name like @Test
 * Function name can be thing like Sending email
 * @Before Test runs only once in the begining of test and can be used to connect to a database etc
 * @After Test runs only once at end of each test and can be used to disconnect from a database
 * @Before method runs every time before each and every Test annotation
 *  * @After method runs every time after each and every Test annotation
Another Thing to be kept in mind is BeforeTest and AfterTest run before
and after the specific java class in which they are defined ie. in this case hte class
New Test
But BeforeSuite and AfterSuite run before and after the complete suite like
in this case if there are more java classes in the test package like 
NewTEst,NewTest etc and we run all those classes together.

 */
public class NewTest {
  @Test
  public void SendingEmail() {
	 System.out.println("Sending email");
  }
  
  @Test
  public void ReceivingEmail() {
	 System.out.println("Receving Email");
  }
  
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before the method");
  }
@AfterMethod
public void AfterMethod(){
	  System.out.println("After  Method");

}
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before the Test");
  }
  
  @AfterTest
  public void AfterTest() {
	  System.out.println("After the Test");
  }
  @BeforeSuite
  public void beforeSuite(){
	  System.out.println("Before the Suite");
  }
  
  @AfterSuite
  public void AfterSuite(){
	  System.out.println("After the Suite");
  }

}
