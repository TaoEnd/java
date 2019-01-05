package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AnnotaionTest {
	
	// 异常处理
	@Test(expected=ArithmeticException.class)
	public void testDiv() {
		assertEquals(3,  new Calculate().div(6, 0));
	}
	
	// 时间操作，2000毫秒后程序停止
	@Test(timeout=2000)
	public void timeTest() {
		while(true) {
			System.out.println("test...");
		}
	}
	
	// Ignore：被Ignore修饰的方法在测试时会被忽略
	@Ignore
	public void ignoreTest() {
		while(true) {
			System.out.println("haha");
		}
	}

}
