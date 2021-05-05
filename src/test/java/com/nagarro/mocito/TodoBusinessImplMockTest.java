package com.nagarro.mocito;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
public class TodoBusinessImplMockTest {

	@Test
	public void usingMock() {
		TodoService MoctodoService=mock(TodoService.class);
		when(MoctodoService.retrieveTodos("parameter")).thenReturn( Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance"));
		//TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(MoctodoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("parameter");
		assertEquals(2, todos.size());
	}
	
	@Test
	public void usingMockito_UsingBDD() {
		TodoService todoService = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");

		//given
		given(todoService.retrieveTodos("Ranga")).willReturn(allTodos);

		//when
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Ranga");

		//then
		assertThat(todos.size(), is(2));
	}
	
	@Test
	public void letsTestDeleteNow() {
        //given
		TodoService todoService = mock(TodoService.class);

		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");

		//when(todoService.retrieveTodos("Ranga")).thenReturn(allTodos);
		given(todoService.retrieveTodos("Ranga")).willReturn(allTodos);

		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

		//when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Ranga");

		// verify(todoService).deleteTodo("Learn to Dance");
		then(todoService).should().deleteTodo("Learn to Dance");

		//verify(todoService, Mockito.never()).deleteTodo("Learn Spring MVC");
		then(todoService).should(never()).deleteTodo("Learn Spring MVC");

		verify(todoService, Mockito.never()).deleteTodo("Learn Spring");

		verify(todoService, Mockito.times(1)).deleteTodo("Learn to Dance");
		// atLeastOnce, atLeast

	}
	
	@Test
	public void captureArgument() {
		
		//Declare Argument captore
		//Define Argument capture on specific method call
		//capture the argument
		ArgumentCaptor<String> argumentCaptor = ArgumentCaptor
				.forClass(String.class);

		TodoService todoService = mock(TodoService.class);

		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		Mockito.when(todoService.retrieveTodos("Ranga")).thenReturn(allTodos);

		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		todoBusinessImpl.deleteTodosNotRelatedToSpring("Ranga");
		//Mockito.verify(todoService).deleteTodo(argumentCaptor.capture());
		then(todoService).should().deleteTodo(argumentCaptor.capture());
        // argumentCaptor.getAllValue(),argumentCaptor.getAllValue().size()
		assertEquals("Learn to Dance", argumentCaptor.getValue());
	}
}