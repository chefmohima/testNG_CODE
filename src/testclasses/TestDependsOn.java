package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestDependsOn {

	@BeforeClass
	public void beforeClass() {
		System.out.println("This should run before any test");
		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This should run after all tests");
	}

	@Test(dependsOnMethods={ "testMethod2" })
	public void testMethod1() {
		System.out.println("testMethod1 -> running !!");
		System.out.println("I depend on testMethod2 ..!");
	
	}
	
	@Test
	public void testMethod2() {
		System.out.println("testMethod2 -> running !!");
	
	}
	
	

}
