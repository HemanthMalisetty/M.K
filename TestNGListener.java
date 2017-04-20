package videos;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {

	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test cases failed and test case details are " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test cases skipped and test case details are " + result.getName());

	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test cases started and test case details are " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success and test case details are " + result.getName());

	}

}
