package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestPriority {
//change ascii order of test execution by setting numeric priorities with Test annotation
	
  @Test(priority=3) 
  public void testMethod1() {
	  System.out.println("Running TestPriority => testmethod1");
  }
  
  @Test(priority=1)
  public void testMethod2() {
	  
	  System.out.println("Running TestPriority => testmethod2");
	  
  }
  
  @Test(priority=2)
  public void testMethod3() {
	  System.out.println("Running TestPriority => testmethod3");
  }
}
