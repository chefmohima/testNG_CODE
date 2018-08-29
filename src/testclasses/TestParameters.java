package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestParameters {
    
	//@Parameters
	
	@BeforeClass
	@Parameters( {"browser", "os"} )
	public void beforeClass(String browser, String os) {
		System.out.println("Reading parameters from xml file:");
		System.out.println("Browser = "+ browser);
		System.out.println("OS = "+ os);
		
		
	}

	@Test
	@Parameters( { "response" } )
	public void testMethod1(String response) {
		System.out.println("HTTP Response code = "+ response);
	}
	
	
	

}
