package DependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	@Test(dependsOnMethods= {"runTest3", "runTest4"})
	public void runTest1() //Even one depending method fails, dependent methods will not run
	{
		System.out.println("In Test1");
	}
	
	@Test(dependsOnMethods= {"runTest3", "runTest4"},alwaysRun=true) //alwaysRun=true working for TEST annotation with DEPENDSONMETHODS (not working for GROUPS)
	public void runTest2() //Even the depending method fails, test will run
	{
		System.out.println("In Test2");
	}
	
	@Test
	public void runTest3() //Dependent methods will run first instead of alpahbetical order
	{
		System.out.println("In Test3");
		Assert.assertTrue(false);
	}
	
	@Test
	public void runTest4() //Dependent methods will run first instead of alpahbetical order
	{
		System.out.println("In Test4");
	}
	
	@Test(enabled=false) 
	public void runTest5() 
	{
		System.out.println("In Test5");
		
	}
	
//	@Test(dependsOnMethods = "runTest5")
//	public void runTest6() // Dependent method in disabled state, will give run time exception
//	{
//		System.out.println("In Test6");
//	}
//
//	@Test(dependsOnMethods = "runTest5", alwaysRun = true)
//	public void runTest7() // Even the dependent method is in disabled state, test will run and fail
//	{
//		System.out.println("In Test7");
//	}
}
