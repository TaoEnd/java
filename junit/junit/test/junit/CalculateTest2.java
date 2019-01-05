package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is set up");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is tear down");
	}

	@Test
	public void test1() {
		System.out.println("this is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("this is test 2");
	}

}
