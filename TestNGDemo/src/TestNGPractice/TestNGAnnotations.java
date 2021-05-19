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

public class TestNGAnnotations 
{
	@Test
	public void runTest1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void runTest2()
	{
		System.out.println("Test2");
	}
	
	@Test
	public void runTest3()
	{
		System.out.println("Test3");
	}
	
	@Test
	public void runTest4()
	{
		System.out.println("Test4");
	}
	
	@BeforeSuite
	public void runBeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeSuite
	public void runBeforeSuite2()
	{
		System.out.println("BeforeSuite2");
	}
	
	@BeforeTest
	public void runBeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeTest
	public void runBeforeTest2()
	{
		System.out.println("BeforeTest2");
	}
	
	@BeforeClass
	public void runBeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeClass
	public void runBeforeClass2()
	{
		System.out.println("BeforeClass2");
	}
	
	@BeforeMethod
	public void runBeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@BeforeMethod
	public void runBeforeMethod2()
	{
		System.out.println("BeforeMethod2");
	}
	
	@AfterSuite 
	public void runAfterSuite() //After Suite runs after all the class in the package is executed
	{
		System.out.println("AfterSuite");
	}
	
	@AfterSuite
	public void runAfterSuite2()
	{
		System.out.println("AfterSuite2");
	}
	
	@AfterTest
	public void runAfterTest()
	{
		System.out.println("AfterTest");
	}
	
	@AfterTest
	public void runAfterTest2()
	{
		System.out.println("AfterTest2");
	}
	
	@AfterClass
	public void runAfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@AfterClass
	public void runAfterClass2()
	{
		System.out.println("AfterClass2");
	}
	
	@AfterMethod
	public void runAfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterMethod
	public void runAfterMethod2()
	{
		System.out.println("AfterMethod2");
	}
}
