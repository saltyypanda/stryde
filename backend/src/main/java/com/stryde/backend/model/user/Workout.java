package com.stryde.backend.model.user;

import java.util.ArrayList;

import com.stryde.backend.model.exercise.ConcreteExercise;

public class Workout {
    private ArrayList<ConcreteExercise> exercises;

    public Workout() {
        this.exercises = new ArrayList<>();
    }

    public boolean addExercise(ConcreteExercise exercise) {
        return exercises.add(exercise);
    }

    public boolean removeExercise(ConcreteExercise exercise) {
        return exercises.remove(exercise);
    }

    public ArrayList<ConcreteExercise> getExercises() {
        return exercises;
    }
}
