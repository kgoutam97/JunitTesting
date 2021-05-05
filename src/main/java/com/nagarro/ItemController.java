package com.nagarro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.model.Item;
import com.nagarro.services.ItemBusinessservices;

@RestController
public class ItemController {
	
	@Autowired
	private ItemBusinessservices  businessservices; 
	
	@GetMapping("/dummy-item")
	public Item dummyItem() {
		
		return new Item(1,"Ball",10,1000);
	}
	
	@GetMapping("/item-from-business-service")
	public Item itemFromBusinessServices() {
		
		return businessservices.retriveHardcodeedItem();
	}
	
	@GetMapping("/all-items-from-database")
	public List<Item> retrievealllItems() {
		
		return  businessservices.retrieveAllItems();
	}
	
	

}
