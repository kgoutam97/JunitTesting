package com.nagarro.business_logics;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.nagarro.model.Item;
import com.nagarro.repository.ItemRepository;
import com.nagarro.services.ItemBusinessservices;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;



@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class) 
public class ItemBusinessservicesTest {
	
	
	
	@InjectMocks
	private ItemBusinessservices business;
	@Mock
	private ItemRepository itemRepository;
	
	

	
	@Test
	public void calculateSumUsingDataServiceTest() throws Exception {
		List<Item> arr=new ArrayList<Item>();
		arr.add(new Item(10,"Item2",10,5));
		arr.add(new Item(11,"Item3",10,10));
		
		when(itemRepository.findAll()).thenReturn(arr);
		List<Item> items=business.retrieveAllItems();
		assertEquals(100,items.get(1).getValue());
		assertEquals(50,items.get(0).getValue());
	}
	
	

}
