package com.exemple.demo.service;

import java.util.List;

import com.exemple.demo.entity.ToDo;
import com.exemple.demo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("toDoService")
public class ToDoServiceImpl implements ToDoService {
	@Autowired
	private ToDoRepository toDoRepository;
	public List<ToDo> getAllToDo() {
		
		return toDoRepository.findAll();
	}
	public ToDo getToDoById(long id) {
		
		
		return toDoRepository.findById(id).get();
	}
	public ToDo saveToDo(ToDo todo) {
		
		return toDoRepository.save(todo);
	}
	public void removeToDo(ToDo todo) {
		toDoRepository.delete(todo);
		toDoRepository.delete(todo);
	}
	@Override
	public void deleteById(long l) {
		toDoRepository.deleteById(l);
		
	}

}
