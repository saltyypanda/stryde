package com.stryde.backend.model;

import java.util.ArrayList;

public class Routine {
    private ArrayList<Workout> workouts;

    public Routine() {
        this.workouts = new ArrayList<>();
    }

    public boolean addWorkout(Workout workout) {
        return workouts.add(workout);
    }

    public boolean removeWorkout(Workout workout) {
        return workouts.remove(workout);
    }
}
