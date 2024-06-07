package com.jhonson.todoexample.repository.list;

import com.jhonson.todoexample.model.Priority;
import com.jhonson.todoexample.model.Status;
import com.jhonson.todoexample.model.Task;
import com.jhonson.todoexample.repository.AbstractTodoRepository;
import com.jhonson.todoexample.repository.Prioritizable;

import java.util.List;

public class TaskListRepository extends AbstractTodoRepository<Task> {


    @Override
    public Task listByPriority() {
        return null;
    }

    @Override
    public List<Task> ListByState(Status status) {
        return List.of();
    }

    @Override
    public void update(Task task) {
        Task result = this.byId(task.getId());
        result.setTask(task.getTask());
        result.setStatus(task.getStatus());
        result.setPriority(task.getPriority());
    }




}
