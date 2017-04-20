package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ScreenShot_on_Failure;

public class Extent_Reports extends ScreenShot_on_Failure {

	ExtentReports reports = null;
	ExtentTest logger = null;
  	WebDriver driver = null;
	String x, j, path = null;

	@Test
	public void VerifyTitle() {

		// creating the extent class object
		reports = new ExtentReports("D:\\javaPrograms\\Selinium\\Extent_reports\\report1.html");

		// starting the test
		logger = reports.startTest("Title verification");

		// setting the path for chrome driver
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new FirefoxDriver();

		// maximizing the page
		driver.manage().window().maximize();
        
		// making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// log status message
		logger.log(LogStatus.INFO, "launching the chrome browser");

		// getting the desired url
		driver.get("http://learn-automation.com/");

		// log status message
		logger.log(LogStatus.INFO, "launching the url");

		// collecting the page title
		j = driver.getTitle();

		// log status message
		logger.log(LogStatus.INFO, "collecting the page title");

		// comparing the title using assertion
		Assert.assertTrue(j.contains("selenium"));

		// log status of comparision
		logger.log(LogStatus.PASS, "Title verified");
		

	}

	@AfterMethod
	public void tearDowm(ITestResult result) {
		// failure report
		if (result.getStatus() == ITestResult.FAILURE) {

			// storing the result in j
			x = captureScreenshot(driver, result.getName());

			// adding screenshot to the report and storing it in string
			path = logger.addScreenCapture(x);

			// log status
			logger.log(LogStatus.FAIL, "Title verification failure", path);

		}

		// ending the test
		reports.endTest(logger);

		// flushing the data into report
		reports.flush();

		// opening the report
		driver.get("D:\\javaPrograms\\Selinium\\Extent_reports\\report1.html");
	}

}
