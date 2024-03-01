package com.stryde.backend.model.exercise;

import com.stryde.backend.model.collectors.StatsCollector;

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
