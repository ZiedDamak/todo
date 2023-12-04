package com.exemple.demo.repository;

import com.exemple.demo.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("toDoRepository")
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
	ToDo findOneByText(String text);
}
