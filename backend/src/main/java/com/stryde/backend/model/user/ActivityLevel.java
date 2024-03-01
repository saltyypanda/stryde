package com.stryde.backend.model.user;

public enum ActivityLevel {
    LEVEL_1("level_1"),
    LEVEL_2("level_2"),
    LEVEL_3("level_3"),
    LEVEL_4("level_4"),
    LEVEL_5("level_5"),
    LEVEL_6("level_6");

    private String string;

    private ActivityLevel(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }
}
