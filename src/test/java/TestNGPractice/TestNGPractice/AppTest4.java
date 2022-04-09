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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest4 {

	
	@Test(dataProvider="getData")
	public void login(String userName, String pwd)
	{
		System.out.println("Login with user name "+userName+" "+"and with password "+pwd);
	
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]= "user1"; data[0][1]="pwd1";
		data[1][0]= "user2"; data[1][1]="pwd2";
		data[2][0]= "user3"; data[2][1]="pwd3";
		return data;
	}
}
