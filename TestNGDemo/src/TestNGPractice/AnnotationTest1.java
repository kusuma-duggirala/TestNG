package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest1 extends TestBase
{
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@BeforeSuite
	public void beforeSuite()  //Overrides super class method
	{
		System.out.println("BeforeSuiteChild");
	}

	@BeforeTest
	public void beforeTest() //Overrides super class method
	{
		System.out.println("BeforeTestChild");
	}

	@BeforeClass
	public void beforeClass() //Overrides super class method
	{
		System.out.println("BeforeClassChild");
	}

	@BeforeMethod
	public void beforeMethod() //Overrides super class method
	{
		System.out.println("BeforeMethodChild");
	}

	@AfterMethod
	public void afterMethod() //Overrides super class method
	{
		System.out.println("AfterMethodChild"); 
	}

	@AfterClass
	public void afterClass() //Overrides super class method
	{
		System.out.println("AfterClassChild");
	}

	@AfterTest
	public void afterTest() //Overrides super class method
	{
		System.out.println("AfterTestChild");
	}

	@AfterSuite
	public void afterSuite() //Overrides super class method
	{
		System.out.println("AfterSuiteChild");
	}

}
