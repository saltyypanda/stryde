package com.stryde.backend.model;

import java.util.ArrayList;

public class Cardio extends ConcreteExercise {
    private ArrayList<ExerciseTime> exerciseTimes;
    private int xp;

    public Cardio(Exercise exercise, int xp) {
        super(exercise);
        this.exerciseTimes = new ArrayList<>();
        this.xp = xp;
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
