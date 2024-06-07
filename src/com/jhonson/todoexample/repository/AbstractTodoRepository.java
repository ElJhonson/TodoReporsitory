package com.jhonson.todoexample.repository;

import com.jhonson.todoexample.model.BaseEntity;
import com.jhonson.todoexample.model.Status;
import com.jhonson.todoexample.model.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTodoRepository<T extends BaseEntity>  implements ComprehensiveInterface<T> {

    List<T> dataSource;

    public AbstractTodoRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public int countElements() {
        if(dataSource == null){
            throw new RuntimeException("Task list not initialized");
        }
        return dataSource.size();
    }

    @Override
    public void create(T t) {
        dataSource.add(t);
    }


    @Override
    public void delete(Integer id) {
        this.dataSource.remove(byId(id));
    }

    @Override
    public List<T> toList() {
        return dataSource;
    }

    @Override
    public T byId(Integer id) {
        T result = null;
        for (T t: dataSource){
            if(t.getId().equals(id)){
                result = t;
            }
        }
        return result;
    }
}
