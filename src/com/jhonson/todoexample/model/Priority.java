package com.jhonson.todoexample.model;

public enum Priority {
    HIGH("High"),
    Medium("Medium"),
    Low("Low");

    private final String PRIORITY;

    Priority(String priority){
        this.PRIORITY = priority;
    }

    public String getPriority() {
        return PRIORITY;
    }

    @Override
    public String toString() {
        return " "+this.PRIORITY;
    }
}
