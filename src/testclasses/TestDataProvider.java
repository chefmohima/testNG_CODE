package testclasses;

import java.io.ObjectInputStream.GetField;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestDataProvider {
	
  @DataProvider(name="inputs")
  public Object[][] getData(){
	  return new Object[][]{
		  {"taxi","bus"},
		  {"bike","cycle"},
		  {"boat","ship"}
	  };
  }
	
  @Test(dataProvider="inputs") //use data from dataprovider
  public void testMethod1(String input1, String input2) {
	  System.out.println("Running TestAnnotation => testmethod1");
	  System.out.println("Input1 = " + input1);
	  System.out.println("Input2 = " + input2);
  }
  
  
  
}
