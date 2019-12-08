package flipWrapper;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionalityOne extends ExtentReport{
	
	@Test
	public void functionality1()
	{
		test =  report.createTest("FunctionalityTest1");
		Assert.assertTrue(1>0);
	}
	@Test
	public void functionality1Test2()
	{
		test =  report.createTest("FunctionalityTest2");
		Assert.assertEquals("Krishna","Sun");
	}


}
