package DependsOn;

import org.testng.annotations.Test;

public class DependsOnMethodsChildClass
{
	@Test(dependsOnMethods= {"parentTest1"})
	public void childTest1()
	{
		System.out.println("ChildClass Test1");
	}
	
	@Test
	public void childTest2()
	{
		System.out.println("ChildClass Test2");
	}
}
