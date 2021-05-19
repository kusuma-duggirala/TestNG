package Parameterization;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
	//Cannot be run from class. only can be run through xml file
	@Test
	@Parameters({"UserName", "PassWord"})
	public void printData(String userName, String password)
	{
		System.out.println("UserName:"+userName+" Password:"+password);
	}
	
	//Can be run from class file also
	//If no parameter named UserName, Password is found in your testng.xml file, your test method will receive the default value specified inside the @Optional annotation.
	@Test
	@Parameters({"UserName", "PassWord"})
	public void optionalParameters(@Optional("OptUN")String userName,@Optional("OptPwd") String password)
	{
		System.out.println("UserName:"+userName+" Password:"+password);
	}
	
	
}