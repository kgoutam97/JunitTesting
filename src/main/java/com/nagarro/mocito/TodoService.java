package com.nagarro.mocito;

import java.util.List;

//External Service - Lets say this comes from WunderList

// create TodoServicestud
//Test TodoBusinessImpl using TodoServiceStub
public interface TodoService {
	public List<String> retrieveTodos(String user);
	void deleteTodo(String todo);
}
