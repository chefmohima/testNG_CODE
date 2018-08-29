package regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestRegression2 extends commonregression.TestCommon{
	
	
  @Test 
  public void testMethod1() {
	  System.out.println("Running TestRegression2 => testmethod1");
  }
  
  @Test //testNG Annotation for a testcase
  public void testMethod2() {
	  
	  System.out.println("Running TestRegression2 => testmethod2");
	  
  }
  
  @Test //testNG Annotation for a testcase
  public void testMethod3() {
	  System.out.println("Running TestRegression2 => testmethod3");
  }
  
  
  @BeforeMethod
	public void beforeMethod() {
		
		System.out.println("TestRegression2 => This will run before every test method");
		
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("TestRegression2 => This will run after every test method");
		
	}

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("TestRegression2 => This will run before the class");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("TestRegression2 => This will run after the class");
	}
  
}
