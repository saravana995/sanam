package flipWrapper;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestingBase {
public ExtentReports report;
public ExtentTest test;
	@Test
	public void Run()
	
	{
		report = new ExtentReports("./report/result.html",false);
		test = report.startTest("Sound on");
		String str = "saravana";
		
		System.out.println(System.getProperty("user.dir"));
			Assert.assertEquals(str, "saravana");
			test.log(LogStatus.PASS,"Application passed successfully");
		report.endTest(test);
		report.flush();
		
	}
}
