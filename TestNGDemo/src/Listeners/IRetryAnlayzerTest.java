package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;
public class IRetryAnlayzerTest 
{
	
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void retryTest()
	{
		System.out.println("Retrying Test");
		Assert.assertTrue(false);
	}
	
	@Test
	public void retryTest2()
	{
		System.out.println("Retrying Test2");
		Assert.assertTrue(false);
	}
}
