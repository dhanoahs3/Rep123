package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registeryahoo {
	 @Test(dataProvider="registerData")//gets data from a function called register data
	 //prints data three times as the data object has 3 rows
	  public void register(String username, String Email, String password, String City) {
		 System.out.println(username + "-----" + Email + "------" + password + "-----"+ City);
	  }
	 
	 @Test
	  public void checkAssertions() {//test appears as fails if both values are not equal
		 System.out.println("Checking equal assertions");
		 Assert.assertEquals("Good", "noGood");
 }
	 
	 @Test
	  public void checkTrueAssertions() {//test appears as fail in log if condition is false and prints that given
		 //error message in logs
		 System.out.println("Checking true assertions");
		 try{
		 Assert.assertTrue(6>10,"Error message-Will print only if condtion is not true");}
		 catch(Throwable t){
			 System.out.println("The error was catch and this test will now pass and this command will print");
		 }
	  //After a assertion fails it does not print the remaining commands. after it like the command below.
		 //To make the below command print even if the assertation fails we have put the assert statement in 
		 //try and catch block.
		 System.out.println("This will not print as the above command fails");
		 }
	 
	 @Test
	  public void checkfalseAssertions() {//test appears as fail in log if condition is true
//and prints the given error message in logs
		 System.out.println("Checking false assertions");
		 Assert.assertFalse(6>10,"Error message-Will print only if condtion is not true");
		 System.out.println("This will print as the above command passes");

	  }
	 
	 
	 @DataProvider
	 public Object[][] registerData(){
		 
		 Object[][] data = new Object[3][4];
		 data[0][0] = "user1";
		 data[0][1] = "email1";
		 data[0][2] = "pasword1";
		 data[0][3] = "city1";
		 
		 data[1][0] = "user2";
		 data[1][1] = "email12";
		 data[1][2] = "pasword2";
		 data[1][3] = "city2";
		 
		 data[2][0] = "user3";
		 data[2][1] = "email3";
		 data[2][2] = "pasword3";
		 data[2][3] = "city3";
		 
		 return data;
		 
		 
	 }
}
