package TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestAnnotationArguments 
{
	WebDriver driver;
	@Test(invocationCount=5) //Test will be executed 5 times
	public void invocationCountTest()
	{
		System.out.println("Invocation Count Test");
	}
	
	@Test(timeOut=10000) //Test will be executed 10 secs and then terminates
	public void timeOutTest()
	{
		int i=1;
		while(i==1)
		System.out.println("TimeOut Test");
	}
	
	@Test //Test will be executed 5 secs and then terminates- timeout specified in xml
	public void timeOutTest2() throws InterruptedException
	{
		int i=1;
		while(i==1)
		System.out.println("TimeOut Test2");
	}
	
	@Test(expectedExceptions=ArithmeticException.class) //Exception will be Ignored and Test passes
	public void expectedExceptionsTest()
	{
		int sum=10/0;
		System.out.println("ExpectedException Test"); //will not print this value
	}
	
	@Test(invocationCount=10,threadPoolSize=3) //will execute 10 times in 3 different threads
	public void threadPoolSizeTest()		   //Threadpoolsize is ignored if invocation count is not specified
	{
		System.out.println("ThreadPoolSize Test"); 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension",false);
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
}

