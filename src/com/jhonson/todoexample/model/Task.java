package com.jhonson.todoexample.model;

import java.util.Objects;

public class Task extends BaseEntity{

    protected Priority priority;
    protected String task;

    public Task(String task, Priority priority) {
        super();
        this.task = task;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", task: '" + task +
                ", priority: " + priority +
                ", status: " + status + '\'';
    }

}
