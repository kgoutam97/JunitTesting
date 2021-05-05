package com.nagarro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.model.Item;
import com.nagarro.repository.ItemRepository;

@Service
public class ItemBusinessservices {
	
	@Autowired
	private ItemRepository itemRepository;

	public Item retriveHardcodeedItem() {
		// TODO Auto-generated method stub
		
		return new Item(1,"Ball",10,1000);
	}
	
	public List<Item> retrieveAllItems(){
		
		List<Item> items=itemRepository.findAll();
		for(Item item:items) {
			item.setValue(item.getPrice()*item.getQuantity());
		}
		return items;
	}
	

}
