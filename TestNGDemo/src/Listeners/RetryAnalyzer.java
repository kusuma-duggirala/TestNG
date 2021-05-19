package Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{
	int retryCount=0;
	int maxRetryCount=4;
	
	@Override
	public boolean retry(ITestResult arg0) 
	{
		if(retryCount<maxRetryCount)
		{
			retryCount++;
			return true;
		}
		return false;
	}

}
