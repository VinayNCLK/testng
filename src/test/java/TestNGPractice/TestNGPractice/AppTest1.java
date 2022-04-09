package TestNGPractice.TestNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest1 {

	@BeforeSuite
	public void suiteSetup()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void suitetearDown()
	{
		System.out.println("After Suite");
	}
	
	
	
	@BeforeClass
	public void setup()
	{
		System.out.println("Before class");
	}
	
	@AfterMethod
	@AfterClass
	public void tearDown()
	{
		System.out.println("After class");
	}
	
	
	
	@BeforeTest
	public void createDBConnetion()
	{
		System.out.println("DB Connection");	
	}
	

	@AfterTest
	public void stopDBConnection()
	{
		System.out.println("DB delete connection");	
	}
	
	@BeforeMethod
	public void lauchAppiumServer()
	{
		System.out.println("Starting appium server");	
	}
	
	@AfterMethod
	public void stopAppiumServer()
	{
		System.out.println("Stopping appium server");
	}
	
	@Test
	public void doUserRegestration()
	{
		System.out.println("Executing do regestration test");
	}
	
	
	@Test
	public void login()
	{
		System.out.println("Executing do login test");
	}
}
