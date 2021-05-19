package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	@DataProvider(parallel=true)
	public Object[][] testData()
	{
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="UserName1";
		obj[0][1]="Password1";
	
		obj[1][0]="UserName2";
		obj[1][1]="Password2";
		
		obj[2][0]="UserName3";
		obj[2][1]="Password3";
		
		return obj;
	}
	
	@Test(dataProvider="testData")
	public void printData(String a, String b)
	{
		System.out.println(a+"   "+b);
	}
}