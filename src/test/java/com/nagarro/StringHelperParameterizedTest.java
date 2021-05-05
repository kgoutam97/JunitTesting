package com.nagarro;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Collection;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	StringHelper helper=new StringHelper(); 
	
	private String input;
	private String expectedOutput;
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		// super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}





	@Parameters
	public static List<Object> testCondition() {
		String expectedOutputs[][]={{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
		
	}
	
	
	
	
	
//	@Test
//	public void truncateAInFirst2PositionsTest() {
//		
//		// AACD => CD ACD => CD CDEF => CDEF CDAA=> CDAA
//		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
//	//	fail("Not Yet Implemented");
//		
//	}
	
	@Test
	public void truncateAInFirst2PositionsTest1() {
		
		// AACD => CD ACD => CD CDEF => CDEF CDAA=> CDAA
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	//	fail("Not Yet Implemented");
		
	}
	
	

}
