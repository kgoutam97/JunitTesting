package com.nagarro.dataLayerTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nagarro.model.Item;
import com.nagarro.repository.ItemRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {
	
	@Autowired
	private ItemRepository repository;
	
	
	@Test
	public void tesrFindAll() {
		
	List<Item> item=repository.findAll();
	 assertEquals(5,item.size());
	}

}
