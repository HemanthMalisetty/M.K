package videos;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {

	@Test
	public void SoftAssertion() {

		// creating the object for soft assertion
		SoftAssert assertion = new SoftAssert();
		System.out.println("starting the test 1");
		assertion.assertEquals(12, 13);
		System.out.println("ending the test1");
		assertion.assertAll();
	}

	@Test
	public void HardAssertion() {
		System.out.println("starting the test 2");
		Assert.assertEquals(12, 13);
		System.out.println("ending the test 2");
	}

}
