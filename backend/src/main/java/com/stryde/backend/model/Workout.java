package com.stryde.backend.model;

import java.util.ArrayList;

public class Workout {
    private ArrayList<ConcreteExercise> exercises;

    public Workout() {
        this.exercises = new ArrayList<>();
    }

    public boolean addExercise(ConcreteExercise exercise) {
        return exercises.add(exercise);
    }

    public boolean removeExercise(ConcreteExercise exercise) {
        return exercises.add(exercise);
    }

    public ArrayList<ConcreteExercise> getExercises() {
        return exercises;
    }
}
