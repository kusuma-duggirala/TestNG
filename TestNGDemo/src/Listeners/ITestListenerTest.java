package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Implementing TestNGListeners at class level
@Listeners(TestListener.class)
public class ITestListenerTest 
{
	int i;
	@Test
	public void test1() //onTestSuccess
	{
		System.out.println("Test1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() //onTestFailure
	{
		System.out.println("Test2");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="test2") //onTestSkipped
	public void test3()
	{
		System.out.println("Test3");
	}
	
	@Test(invocationCount=5,successPercentage=40)
	public void test4() //onTestFailedButWithinSuccessPercentage
	{
		i++;
		if(i==1||i==2)
		{
			Assert.assertEquals(i,8);
		}
		
	}
	
}

