package TestNGPractice.TestNGPractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest6 {

	
	
	@Test()
	public void login()
	{
		System.out.println("This is a passed test case");
	
	}
	
	
	@Test()
	public void login1()
	{
		System.out.println("This is a failed test case");
		AssertJUnit.fail(); //To fail the test case purposefully
	
	}
	
	@Test()
	public void login2()
	{
		System.out.println("This is a skip test case");
		throw new SkipException("Skipping the test case");
	
	}

}
