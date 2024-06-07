package com.jhonson.todoexample.model;

public enum Status {
    COMPLETED("Completed"),
    NOCOMPLETED("No Completed");

    private final String PRIORITY;

    Status(String PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    public String getPRIORITY() {
        return PRIORITY;
    }

    @Override
    public String toString() {
        return " "+PRIORITY;
    }


}
