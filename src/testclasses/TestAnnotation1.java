package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestAnnotation1 {
	
  @Test //testNG Annotation for a testcase
  public void testMethod1() {
	  System.out.println("Running TestAnnotation => testmethod1");
  }
  
  @Test //testNG Annotation for a testcase
  public void testMethod2() {
	  SomeClassToTest obj  = new SomeClassToTest();
	  int result = obj.sumNumbers(2,4);
	  System.out.println("Running TestAnnotation => testmethod2");
	  System.out.println("Result = "+ result);
  }
  
  @Test //testNG Annotation for a testcase
  public void testMethod3() {
	  System.out.println("Running TestAnnotation => testmethod3");
  }
}
