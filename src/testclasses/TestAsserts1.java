package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestAsserts1 {
	
  @Test //testNG Annotation for a testcase
  public void testMethod1() {
	  System.out.println("Running TestAsserts1 => testmethod1");
	  SomeClassToTest obj  = new SomeClassToTest();
	  int result = obj.multiply(2,4);
	  Assert.assertEquals(8,result);
  }
  
  @Test //testNG Annotation for a testcase
  public void testMethod2() {
	  SomeClassToTest obj  = new SomeClassToTest();
	  int result = obj.sumNumbers(2,4);
	  System.out.println("Running TestAsserts1 => testmethod2");
	  System.out.println("Result = "+ result);
	  Assert.assertEquals(6,result);
  }
  
  
  
  @Test //testNG Annotation for a testcase
  public void testMethod3() {
	  System.out.println("Running TestAsserts1 => testmethod3");
	  SomeClassToTest obj  = new SomeClassToTest();
	  int result = obj.subtract(2,4);
	  Assert.assertEquals(-2,result);
  }
}
