package flipWrapper;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionalityTwo extends ExtentReport{
	
	@Test
	public void functionality2()
	{
		test =  report.createTest("FunctionalityTest2");
		Assert.assertTrue(1>0);
	}
	@Test
	public void functionality2Test2()
	{
		test =  report.createTest("Functionality2Test2");
		Assert.assertEquals("Krishna","Sun");
	}



}
