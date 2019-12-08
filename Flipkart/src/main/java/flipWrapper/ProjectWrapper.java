package flipWrapper;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import flipWrapper.DP;



@Test
public class ProjectWrapper {
public String getSheetName;
	
	@BeforeSuite
	public void BeforeSuite()
	{
		
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		
	}
	@BeforeClass
	public void BeforeClass()
	{
		
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		
	}
	public void Test()
	{
		
	}
	@AfterMethod
	public void AfterMethod()
	{
		
	}
	@AfterClass
	public void AfterClass()
	{
		
	}
	@AfterTest
	public void AfterTest()
	{
		
	}
	@AfterSuite
	public void AfterSuite()
	{
		
	}
	
	@DataProvider(name="FETCHDATA")
	public String[][] getinput()
	{
		return DP.getData(getSheetName);
		
	}
	
	
}
