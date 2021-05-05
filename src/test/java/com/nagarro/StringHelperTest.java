package com.nagarro;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper helper;
	
	
	@Before
	public void before() {
		helper=new StringHelper();
	}
	
	
	
	@Test
	public void truncateAInFirst2PositionsTest() {
		
		// AACD => CD ACD => CD CDEF => CDEF CDAA=> CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	//	fail("Not Yet Implemented");
		
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSameTest() {
	assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	
		
	}

}
