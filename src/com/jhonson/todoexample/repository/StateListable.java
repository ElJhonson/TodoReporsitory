package com.jhonson.todoexample.repository;

import com.jhonson.todoexample.model.Status;

import java.util.List;

public interface StateListable<T> {
    List<T> ListByState(Status status);
}
