package defaultpackage;
import org.testng.annotations.Test;

public class SampleTestNg {
	//In order to install TestNg in Eclipse we go to 
	//Help->Install new software
	//In works with we type //http://beust.com/eclipse(This link we get after typing
	//install TestNg in google and opening the first link and choosing testng for eclipse>3.4)
	//we select Testng from options below
	//click next-next and Testng is installed
	//Then go to Window->Show view->expand Java and we see testng installed there
//Now testng does not have a main function
	//it only has annotations aka annotion functions
	//The type the below to commands in one go
	//Then add TESTNG librararies and import the annotation test
	@Test
	public void testapplications(){
		System.out.println("Testing application");
	}
	@Test
	public void testanotherapplication(){
		System.out.println("Testing application");
	}
	//So basically we have made two functions or to be more specific two test cases
	//Then we can click SampleTestNg from right hand side and select run as ->Testng
	//This class willl run even if it does not have a main window as Testng annotation methods
	//dont require a main mehtod to run
	
	//In the console along with the results we will see something as this
	
	/*
	 PASSED: testanotherapplication
	 PASSED: testapplications

	 ===============================================
	     Default test
	     Tests run: 2, Failures: 0, Skips: 0
	 ===============================================

	 */
	//which means both test cases have passed
	//Then it says out of total test cases run i.e 2 there were no failures or skips
}
