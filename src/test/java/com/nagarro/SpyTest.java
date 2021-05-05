package com.nagarro;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Spy;

class SpyTest {

	@Test
	public void test() {
		List SpyList=spy(ArrayList.class);
		SpyList.add("dummy");
		assertEquals(1, SpyList.size());
		
	}
	

	@Test
	public void test1() {
		List mockList=mock(ArrayList.class);
		mockList.add("dummy");
		assertEquals(0, mockList.size());
	}

}
