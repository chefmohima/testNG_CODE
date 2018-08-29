package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestAnnotation2 {
	
	@Test
	public void testMethod1() {
		
		System.out.println("In testmethod1 -> printing");
		
	}
	
	@Test
	public void testMethod2() {
		
		System.out.println("In testmethod2 -> printing");
		
	}


	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("This will run before every test method");
		
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("This will run after every test method");
		
	}

	@BeforeClass
	public void beforeClass() {
		
		System.out.println("This will run before the class");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("This will run after the class");
	}

}
