package com.stryde.backend.model;

public abstract class Exercise {
    private String name;
    private String description;

    public Exercise(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
