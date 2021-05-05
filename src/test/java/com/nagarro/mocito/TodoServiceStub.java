package com.nagarro.mocito;
import java.util.Arrays;
import java.util.List;
//this is stub
public class TodoServiceStub implements TodoService {
	
	//Dynamic Condition
	//service Defination
	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}

	@Override
	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub
		
	}
}