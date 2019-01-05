package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// 使用测试套件组织多个测试类共同运行
// 测试套件类是一个空类，并且必须是public修饰的，需要使用RunWith改变测试运行器，
// 同时使用Suite.SuitClasses以数组形式引入测试类

@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class, TaskTest2.class, TaskTest3.class})
public class SuitTest {

}
