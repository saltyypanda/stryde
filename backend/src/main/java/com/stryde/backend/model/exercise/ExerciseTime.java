package com.stryde.backend.model.exercise;

public class ExerciseTime {
    //time is in seconds
    private int time;
    private int rest;

    public ExerciseTime(int time, int rest) {
        this.time = time;
        this.rest = rest;
    }
    
    public int getTime() {
        return time;
    }

    public int getRest() {
        return rest;
    }
}
