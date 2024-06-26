package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario3
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}
	
	@Test(groups="Smoke")
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test(groups={"Smoke","Regression"})
	public void third_testcase()
	{
		System.out.println("this is third test case");
		
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
		Assert.assertEquals("hello1", "hello");
	}
	
	@Test(groups={"Sanity","Regression"})
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	
	
}
