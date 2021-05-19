package DependsOn;

import org.testng.annotations.Test;

public class DependsOnGroupsOtherClass 
{
	@Test(dependsOnGroups= "otherclass") //will execute the groups in other Packages/Class without inheritance
	public void xyz()
	{
		System.out.println("In xyz");
	}
	
}
