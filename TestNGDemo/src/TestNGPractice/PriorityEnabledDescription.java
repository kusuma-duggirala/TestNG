package TestNGPractice;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityEnabledDescription 
{
	
	@BeforeTest(enabled=true, description="Running BeforeTest1")//Giving priority to any annotation other than Test gives compile time error
	public void runBeforeTest()
	{
		System.out.println("In BeforeTest1");
	}
	
	@Test(priority=2, enabled=false,description="Running Test1")
	public void runTest1()
	{
		System.out.println("In Test1");
	}
	
	@Test(priority=3)
	public void runTest2() 
	{
		System.out.println("In Test2");
		throw new SkipException("Testing Skip Test");  //Another way to skip test in TestNG
		//System.out.println("In Test2"); //Compile Time error-Unreachable code
	}
	
	@Test(priority=0,description="Running Test3")
	public void runTest3()
	{
		System.out.println("In Test3");
	}
	
	@Test
	public void runTest4() //Test that has no priority considered as priority=0
	{
		System.out.println("In Test4");
	}
	
	@Test(priority=-3)
	public void runTest5()  //-3<0
	{
		System.out.println("In Test5");
	}
	

}
