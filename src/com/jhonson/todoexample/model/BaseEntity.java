package com.jhonson.todoexample.model;

import java.util.Objects;

public class BaseEntity {
    protected Integer id;
    protected static int idAux=0;
    protected Status status;

    public BaseEntity() {
        this.id = ++idAux;
        this.status = Status.NOCOMPLETED;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Task o = (Task) obj;
        return Objects.equals(this.id, o.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
