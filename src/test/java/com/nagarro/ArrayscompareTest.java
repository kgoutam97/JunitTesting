package com.nagarro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayscompareTest {
	
	//Arrays.sort

	@Test
	public void testArraysSort() {
		int[] numbers= {12,3,4,1};
		int[] expected= {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
	//	fail("Not yet implemented");
	}

	@Test
	public void testArrayNull() {
		int[] numbers= null;
		//int[] expected= {1,3,4,12};
//		try {
//			Arrays.sort(numbers);
//		}catch(NullPointerException e) {
//			
//			//success
//			
//		}
		
		
		//assertArrayEquals(expected,numbers);
	//	fail("Not yet implemented");
	}

}
