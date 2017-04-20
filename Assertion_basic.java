package videos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_basic {

	@Test
	public void Test1() {

		System.out.println("starting test1");
		Assert.assertEquals(12, 12);
		System.out.println("Finishing test1");

	}

	@Test
	public void Test12() {
		System.out.println("starting test2");
		Assert.assertEquals(11, 10, "sarriga vattha ra puski");
		System.out.println("finishing test2");
	}

	@Test
	public void Test13() {
		System.out.println("started test3");
		Assert.assertTrue(false);
		System.out.println("finished test3");
	}

	@Test
	public void Test14() {
		System.out.println("started test4");
		Assert.assertTrue(true);
		System.out.println("finished test4");
	}

}
