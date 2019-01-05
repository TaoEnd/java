package junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// 使用多组数据进行测试
// 首先更改默认的测试运行器
@RunWith(Parameterized.class)
public class ParameterTest {
	
	int excepted = 0;
	int input1 = 0;
	int input2 = 0;
	
	public ParameterTest(int excepted, int input1, int input2) {
		this.excepted = excepted;
		this.input1 = input1;
		this.input2 = input2;
	}
	
	// 声明一个返回值为Collection的公共静态方法，并使用Parameters修饰
	@Parameters
	public static Collection<Object[]> t(){
		return Arrays.asList(new Object[][] {
			{3, 1, 2},
			{4, 2, 2}
		});
	}
	
	@Test
	public void addTest() {
		assertEquals(excepted, new Calculate().add(input1, input2));
	} 
	

}
