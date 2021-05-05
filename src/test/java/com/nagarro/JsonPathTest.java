package com.nagarro;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonPathTest {
	
	@Test
	public void learning() {
		String responseFromServices="[\n" + 
				"{ \"id\":1000,\"name\":\"pencil\",\"quantity\":5}," + 
				"{ \"id\":1001,\"name\":\"pen\",\"quantity\":6}," + 
				"{ \"id\":1002,\"name\":\"Eraser\",\"quantity\":7}," + 
				"{ \"id\":1003,\"name\":\"shopner\",\"quantity\":8}" + 
				"]";
		DocumentContext context = JsonPath.parse(responseFromServices);
		int length=context.read("$.length()");
		assertThat(length).isEqualTo(4);
		List<Integer> ids=context.read("$..id");
		assertThat(ids).containsExactly(1000,1001,1002,1003);
		//System.out.println(ids.toString());
		System.out.println(context.read("$.[1]").toString());
		System.out.println(context.read("$.[0:1]").toString());
		System.out.println(context.read("$.[?(@.name=='pen')]").toString());
		System.out.println(context.read("$.[?(@.quantity==8)]").toString());
		
		
		
		}

}
