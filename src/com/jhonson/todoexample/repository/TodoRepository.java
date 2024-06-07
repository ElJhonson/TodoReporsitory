package com.jhonson.todoexample.repository;

import java.util.List;

public interface TodoRepository<T> {
    void create(T t);
    void update(T t);
    void delete(Integer id);
    List<T> toList();
    T byId(Integer id);
}
