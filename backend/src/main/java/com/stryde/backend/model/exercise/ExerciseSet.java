package com.stryde.backend.model.exercise;

public class ExerciseSet {
    private int reps;
    private double weight;

    public ExerciseSet(int reps, double weight) {
        this.reps = reps;
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public double getWeight() {
        return weight;
    }
}
