package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions 
{
	SoftAssert soft=new SoftAssert();
	@Test
	public void hardAssertTest()
	{
		System.out.println("BeforeAssertTest");
		Assert.assertEquals(10, 12);
		System.out.println("AfterAssertTest");
	}
	
	@Test
	public void softAssertTest()
	{
		//SoftAssert soft=new SoftAssert();
		System.out.println("BeforeSoftAssertTest");
		soft.assertEquals(10, 12);
		System.out.println("AfterSoftAssertTest");//Statement will be executed and Test will be passed
	}
	
	@Test
	public void softAssertTest2()
	{
		//SoftAssert soft=new SoftAssert();
		System.out.println("BeforeSoftAssertTest2");
		soft.assertEquals(10, 12);
		System.out.println("AfterSoftAssertTest2");//Statement will be executed and Test will be failed as we are using soft.assertAll(); statement
		//code
		soft.assertAll(); // It will collect all the errors and fails the test
		System.out.println("AfterAssertAllCommand");//This statement will not be executed
	}
	
}

