package DependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups 
{
	@Test(dependsOnGroups= "sanitytest") 
	public void runTest1()
	{
		System.out.println("In Test1");
	}
	
	@Test(dependsOnGroups= "sanitytest",alwaysRun=true) 
	public void runTest2()
	{
		System.out.println("In Test2");
	}
	
	
	@Test(groups= {"sanitytest"}) //Dependent group methods will execute first
	public void runTest3()
	{
		System.out.println("Sanity Test3");
	}
	
	@Test(groups= {"sanitytest"}) //Dependent group methods will execute first
	public void runTest4()				
	{
		System.out.println("Sanity Test4");
		Assert.assertTrue(false);
	}
	
	@Test(groups= "otherclass") //Dependent group methods will execute first
	public void runTest5()				
	{
		System.out.println("OtherClassTest");
	}

//	@Test(groups = {"regressiontest"})
//	public void runTest4() 
//	{
//		System.out.println("Regression Test1");
//	}
}
