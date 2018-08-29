package regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestRegression1 extends commonregression.TestCommon {

	@Test
	public void testMethod1() {
		System.out.println("Running TestRegression1 => testmethod1");
	}

	@Test
	public void testMethod2() {

		System.out.println("Running TestRegression1 => testmethod2");

	}

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("TestRegression1 => This will run before every test method");
		
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("TestRegression1 => This will run after every test method");
		
	}

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("TestRegression1 => This will run before the class");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("TestRegression1 => This will run after the class");
	}
	
	
}
