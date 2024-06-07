package com.jhonson.todoexample.repository;

import com.jhonson.todoexample.model.BaseEntity;
import com.jhonson.todoexample.model.Task;

public interface ComprehensiveInterface<T extends BaseEntity> extends TodoRepository<T>,
        StateListable<T>, Prioritizable<T>, Countable{
}
