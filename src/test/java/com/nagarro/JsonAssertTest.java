package com.nagarro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
	
	String actualResponse="{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":1000}";
	
	@Test
	public void jsonAssert() throws JSONException {
		String expectedResponse="{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":1000}";
		JSONAssert.assertEquals(expectedResponse, actualResponse,true);
	}
}
