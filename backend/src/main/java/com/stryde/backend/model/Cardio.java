package com.stryde.backend.model;

import java.util.ArrayList;

public class Cardio extends ConcreteExercise {
    private ArrayList<ExerciseTime> exerciseTimes;

    public Cardio(Exercise exercise) {
        super(exercise);
        this.exerciseTimes = new ArrayList<>();
    }

    @Override
    void accept(StatsCollector visitor) {
        visitor.visitCardioExercise(this);
    }

    public ArrayList<ExerciseTime> getExerciseTimes() {
        return exerciseTimes;
    }

    public boolean addExerciseSet(ExerciseTime time) {
        return exerciseTimes.add(time);
    }

    public boolean removeExerciseSet(ExerciseTime time) {
        return exerciseTimes.remove(time);
    }
}
