package testclasses;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestITestResult {
  @Test
  public void testMethod1() {
	  System.out.println("Running testMethod1...");
	  Assert.assertTrue(false);
  }
  
  
  @Test
  public void testMethod2() {
	  System.out.println("Running testMethod2...");
	  Assert.assertTrue(true);
  }
  	
  
  @AfterMethod 
  //uses the ITestResult methods to get status of the method run
  public void afterMethod(ITestResult testResult) {
	  
	  if (testResult.getStatus() == ITestResult.FAILURE) {
		  System.out.println("Failed: " + testResult.getMethod().getMethodName());
	  }
	  
	  else {
		  
		  System.out.println("Passed: " + testResult.getMethod().getMethodName());
	  
	  }
  }

}
