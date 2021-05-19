package DependsOn;

import org.testng.annotations.Test;

public class DependsOnMethodsParentClass 
{
	@Test
	public void parentTest1()
	{
		System.out.println("ParentClass Test1");
	}
	
	@Test
	public void parentTest2()
	{
		System.out.println("ParentClass Test2");
	}
}