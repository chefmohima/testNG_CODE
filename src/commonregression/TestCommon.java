package commonregression;

//import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class TestCommon {
  //base class with common functions not particular to each test
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("TestCommon => This will run before a test suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("TestCommon => This will run after a test suite");
  }
  
  @BeforeClass
	public void beforeClass() {
		
		System.out.println("TestCommon => This will run before the class");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("TestCommon => This will run after the class");
	}

}
