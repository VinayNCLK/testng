package retryAnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	int counter = 0;
	int maxretrycount  =1;
	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(counter<maxretrycount)
		{
			System.out.println("Retying test "+result.getName()+" with status "+getResultStatusName(result.getStatus())+" for the "+ (counter+1));
			counter++;
			return true;
		}
		return false;
	}

	
	public String getResultStatusName(int status)
	{
		String resultName = null;
		if(status == 1)
		{
			resultName = "SUCCESS";
		}
		if(status == 2)
		{
			resultName = "FAILURE";
		}
		if(status == 3)
		{
			resultName = "SKIP";
		}
		
		return resultName;
	}
	
}
