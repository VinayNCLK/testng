package TestNGPractice.TestNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest3 {

	
	@Test(groups= {"regression"})
	public void doUserRegestration()
	{
		
		String expectedResult = "abc";
		String actualResult = "cde";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actualResult, expectedResult);

		
		System.out.println("Continuing next lines");
		
		
		
		soft.assertAll();
	}
	
	
	@Test(groups= {"smoke"})
	public void alogin()
	{
		String expectedResult = "abc";
		String actualResult = "cde";
		
		Assert.assertEquals(actualResult, expectedResult, "Text is mismatched");
		System.out.println("After tha hard assertion");
	}
}
