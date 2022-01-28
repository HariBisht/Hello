package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic
{
	@BeforeSuite
	public void befores()
	{
		System.out.println("hi");
	}	

	@Test
public void Demo()
{
	System.out.println("hi");
}

@BeforeTest
public void Second()
{
	System.out.println("by");
}
@AfterTest
public void last()
{
	System.out.println("last exexcution");
}
}


