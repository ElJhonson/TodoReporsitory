package com.jhonson.todoexample.model;

public class Task {
    protected Integer id;
    protected static Integer idAux;
    protected Priority priority;
    protected Status status;
    protected String task;

    public Task() {
        this.id = ++idAux;
        this.status = Status.NOCOMPLETED;
    }

    public Task(String task, Priority priority) {
        this();
        this.task = task;
        this.priority = priority;
    }
}
