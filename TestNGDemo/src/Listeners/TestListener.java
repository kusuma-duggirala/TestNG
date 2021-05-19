package Listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

//public class TestListener implements ITestListener
public class TestListener extends TestListenerAdapter //TestListenerAdapter implements ITestListener Interface
{

	@Override
	public void onFinish(ITestContext arg0) 
	{
		System.out.println("Test exceution has completed");
		Reporter.log("Test Suite exceution has completed"); //TestNG Log-will be printed in TestNG report not on console
		
	}

	@Override
	public void onStart(ITestContext arg0) 
	{
		
		System.out.println("Test exceution has started");
		Reporter.log("Test Suite exceution has started"); //TestNG Log-will be printed in TestNG report not on console
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		System.out.println(result.getName()+" has failed but within success percentage");
		Reporter.log(result.getName()+" has failed but within success percentage"); //TestNG Log-will be printed in TestNG report not on console
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName()+" has failed");
		Reporter.log(result.getName()+" has failed"); //TestNG Log-will be printed in TestNG report not on console
		//if(result.getStatus()==ITestResult.FAILURE)
//		if(!result.isSuccess())
//		{
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			File source=ts.getScreenshotAs(OutputType.FILE);
//			String dest=System.getProperty("user.dir")+"/Screenshots/"+Name+".png";
//			System.out.println(dest);
//			try 
//			{
//				FileUtils.copyFile(source, new File(dest));
//			} 
//			catch (IOException e) 
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return dest;
//		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println(result.getName()+" has skipped");
		Reporter.log(result.getName()+" has skipped"); //TestNG Log-will be printed in TestNG report not on console
	}

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getName()+" has started");
		Reporter.log(result.getName()+" has started"); //TestNG Log-will be printed in TestNG report not on console
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName()+" has passed");
		Reporter.log(result.getName()+" has passed"); //TestNG Log-will be printed in TestNG report not on console
	}

}

