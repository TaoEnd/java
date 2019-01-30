package com.bjpowernode.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloMavenTest {

	@Test
	public void test() {
		HelloMaven hm = new HelloMaven();
		String actual = hm.m1();
		String expected = "Hello Maven";
		assertEquals(expected, actual);
	}

}
