package com.exemple.demo.service;

import com.exemple.demo.entity.ToDo;

import java.util.List;


public interface ToDoService {
	public List<ToDo> getAllToDo();
	public ToDo getToDoById(long id);
	public ToDo saveToDo(ToDo todo);
	public void removeToDo(ToDo todo);
	public void deleteById(long l);
}