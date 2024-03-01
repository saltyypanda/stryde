package com.stryde.backend.model;

public enum Sex {
    MALE("male"),
    FEMALE("female");

    private String string;

    private Sex(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }
}
