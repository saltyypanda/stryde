package com.stryde.backend.model;

public abstract class ConcreteExercise {
    private Exercise exercise;

    public ConcreteExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Exercise getExercise() {
        return exercise;
    }

    abstract void accept(StatsCollector visitor);
}
