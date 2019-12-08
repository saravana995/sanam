package flipWrapper;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;

public class ExtentReport {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports report;
	public static ExtentTest test;

	@BeforeSuite
	public void setup()
	{
		htmlReporter= new ExtentHtmlReporter("./report/result.html");
	report= new ExtentReports();
	report.attachReporter(htmlReporter);
	}
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.fail(MarkupHelper.createLabel(result.getName()+"TestcaseFailed",ExtentColor.RED));
		test.fail(result.getThrowable());
		
		}else if(result.getStatus()==ITestResult.SUCCESS) 
		{
			test.pass(MarkupHelper.createLabel(result.getName()+"TestCase passed", ExtentColor.GREEN));
			
		}
		else
		{
			test.skip(MarkupHelper.createLabel(result.getName()+"TestCase Skipped", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}
		
	}
	@AfterSuite
	public void tearDown()
	{
		report.flush();
		

	}
}
