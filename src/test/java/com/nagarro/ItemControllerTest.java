package com.nagarro;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nagarro.model.Item;
import com.nagarro.services.ItemBusinessservices;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemBusinessservices businessService;
	
	@Test
	public void dummyItemTest() throws Exception {
		
		RequestBuilder request=MockMvcRequestBuilders
				       .get("/dummy-item")
				       .accept(MediaType.APPLICATION_JSON);
		MvcResult result=mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":1000}"))
				.andReturn();
		//JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(),false);
		//assertEquals("Hello World",);

	}
	
	@Test
	public void dummyItemTest1() throws Exception {
		
		when(businessService.retriveHardcodeedItem()).thenReturn(new Item(2,"Item2",10,10));
		
		RequestBuilder request=MockMvcRequestBuilders
				       .get("/item-from-business-service")
				       .accept(MediaType.APPLICATION_JSON);
		MvcResult result=mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{id:2,name:Item2,price:10}"))
				.andReturn();
		//JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(),false);
		//assertEquals("Hello World",);

	}
	

	@Test
	public void dummyItemTest2() throws Exception {
		
		List<Item> arr=new ArrayList<Item>();
		arr.add(new Item(10,"Item2",10,1));
		arr.add(new Item(11,"Item3",10,10));
		
		when(businessService.retrieveAllItems()).thenReturn(arr);
		
		RequestBuilder request=MockMvcRequestBuilders
				       .get("/all-items-from-database")
				       .accept(MediaType.APPLICATION_JSON);
		MvcResult result=mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[{id:10,name:Item2,price:10},{id:11,name:Item3,price:10}]"))
				.andReturn();
		//JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(),false);
		//assertEquals("Hello World",);

	}

}
