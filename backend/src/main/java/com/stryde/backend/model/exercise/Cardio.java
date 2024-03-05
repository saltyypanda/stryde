package com.stryde.backend.model.exercise;

import java.util.ArrayList;

import com.stryde.backend.model.collectors.StatsCollector;

public class Cardio extends ConcreteExercise {
    private ArrayList<ExerciseTime> exerciseTimes;
    private final static int xp = 50;

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

    public boolean addExerciseTime(ExerciseTime time) {
        return exerciseTimes.add(time);
    }

    public boolean removeExerciseTime(ExerciseTime time) {
        return exerciseTimes.remove(time);
    }

    public int getTotalTime() {
        int totalTime = 0;
        for(ExerciseTime time : exerciseTimes) {
            totalTime += time.getTime();
        }
        return totalTime;
    }

    public int getXp() {
        return xp;
    }
}
