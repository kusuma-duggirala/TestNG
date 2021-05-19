package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInOtherClass 
{
	@Test(dataProvider="testData", dataProviderClass=DataProviderTest.class)
	public void printData(String a, String b)
	{
		System.out.println(a+"   "+b);
	}
}

