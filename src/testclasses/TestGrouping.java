package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestGrouping {

	@Test(groups = {"student"})
	public void testMethod1() {
		String test = "Harry";
		System.out.println("Running TestGrouping => testmethod1");
		System.out.println("Student = " + test);
	}

	@Test(groups = {"student"})
	public void testMethod2() {

		String test = "Hermione";
		System.out.println("Running TestGrouping => testmethod2");
		System.out.println("Student = " + test);

	}

	@Test(groups = {"student"})
	public void testMethod3() {
		String test = "Ron";
		System.out.println("Running TestGrouping => testmethod3");
		System.out.println("Student = " + test);
	}
	
	@Test(groups = {"house"})
	public void testMethod4() {
		String test = "Gryffindor";
		System.out.println("Running TestGrouping => testmethod4");
		System.out.println("House = " + test);
	}

	@Test(groups = {"house"})
	public void testMethod5() {
		String test = "Slytherin";
		System.out.println("Running TestGrouping => testmethod5");
		System.out.println("House = " + test);
	}

	

	@BeforeClass(alwaysRun=true)
	public void beforeClass() {

		System.out.println("TestGrouping => This will run before the class");
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {

		System.out.println("TestGrouping => This will run after the class");
	}

}
