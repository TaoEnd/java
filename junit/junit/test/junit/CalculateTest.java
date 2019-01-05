package junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class CalculateTest {

	@Test
	public void addTest() {
		assertEquals(8, new Calculate().add(4, 4));
	}
	
	@Test
	public void mulTest() {
		assertEquals(7, new Calculate().mul(3, 2));
	}
	
}
