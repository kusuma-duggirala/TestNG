package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Output will be same if we run this class
//For grouping concept to reflect, Should run grouping.xml as TestNG suite or We can run from Run Configurations
public class Grouping 
{
	@BeforeGroups(alwaysRun=true,groups="sanity")
	//@BeforeGroups()                  //If we don't include any group, Before Groups method will not be executed 
	public void runBeforeGroups()
	{
		System.out.println("In BeforeGroups");
	}
	
	//@AfterGroups(groups= {"regression","smoke"})
	@AfterGroups()
	public void runAfterGroups()
	{
		System.out.println("In AfterGroups");
	}
	
	@BeforeSuite(groups="sanity",alwaysRun=true)
	public void beforeSuite() 
	{
		System.out.println("BeforeSuite");
	}

	@BeforeTest(groups="sanity",alwaysRun=true)
	public void beforeTest() 
	{
		System.out.println("BeforeTest");
	}

	@BeforeClass(groups="sanity",alwaysRun=true)
	public void beforeClass() 
	{
		System.out.println("BeforeClass");
	}

	@BeforeMethod(groups="sanity",alwaysRun=true)
	public void beforeMethod() 
	{
		System.out.println("BeforeMethod");
	}

	@AfterMethod(groups="sanity",alwaysRun=true)
	public void afterMethod() 
	{
		System.out.println("AfterMethod");
	}

	@AfterClass(groups="sanity",alwaysRun=true)
	public void afterClass() 
	{
		System.out.println("AfterClass");
	}

	@AfterTest(groups="sanity",alwaysRun=true)
	public void afterTest() 
	{
		System.out.println("AfterTest");
	}

	@AfterSuite(groups="sanity",alwaysRun=true)
	public void afterSuite() 
	{
		System.out.println("AfterSuite");
	}

	
	
	@BeforeTest(groups= {"regression", "smoke"}) //Groups included will execute
	                  //(alwaysRun=true)         //Runs regardless of what group it belongs to
	public void runBeforeTest()
	{
		System.out.println("In BeforeTest");
	}
	
	@AfterTest(groups= {"regression", "smoke"}) //Groups included will execute
					 //(alwaysRun=true)         //Runs regardless of what group it belongs to
	public void runAfterTest()
	{
		System.out.println("In AfterTest");
	}
	
	@Test(groups= {"sanity"})
	public void runTest1()
	{
		System.out.println("In Test1");
	}
	
	@Test(groups= {"regression"})
	public void runTest2()
	{
		Assert.assertTrue(false);
		System.out.println("In Test2");
	}
	
	@Test(groups= {"smoke"},alwaysRun=true) //alwaysRun=true is ignoring for TEST annotation with GROUPS, 
	public void runTest3()					//NOTE: alwaysRun=true for TEST annotation works with DEPENDSONMETHODS
	{
		System.out.println("In Test3");
	}
	
	@Test(groups= {"sanity", "regression"})
	public void runTest4()
	{
		System.out.println("In Test4");
	}
	
	@Test(groups= {"sanity", "regression", "smoke"})
	public void runTest5()
	{
		System.out.println("In Test5");
	}
	
}

