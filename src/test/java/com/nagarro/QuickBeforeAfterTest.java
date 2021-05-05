package com.nagarro;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void setupBeforeClass() {
		System.out.println("Before class test");
	}
	
	
	
	@Before
	public void setup() {
	//	fail("Test");
		System.out.println("Before test");
	}
	
	@Test
	public void test() {
		System.out.println("Test 1 excecuted");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2 excecuted");
	}
	
	@After
	public void after() {
		System.out.println("after test");
	}
	
	@AfterClass
	public static void setupAfterClass() {
		System.out.println("after class test");
	}

}
