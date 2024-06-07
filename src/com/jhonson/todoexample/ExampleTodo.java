package com.jhonson.todoexample;

import com.jhonson.todoexample.model.Priority;
import com.jhonson.todoexample.model.Task;
import com.jhonson.todoexample.repository.AbstractTodoRepository;
import com.jhonson.todoexample.repository.list.TaskListRepository;

import java.util.ArrayList;
import java.util.List;

public class ExampleTodo {
    public static void main(String[] args) {
        AbstractTodoRepository<Task> tasks = new TaskListRepository();
        List<Task> ordenable = new ArrayList<>();

        tasks.create(new Task("Clear my room", Priority.HIGH));
        tasks.create(new Task("Buy food", Priority.HIGH));
        tasks.create(new Task("wash my sneakers", Priority.Low));
        tasks.create(new Task("Buy clothes", Priority.Medium));

        List<Task> taskList = tasks.toList();

        taskList.forEach(System.out::println);

        System.out.println("List by Priority");

    }

}
