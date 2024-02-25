package com.stryde.backend.model;

import java.util.ArrayList;

public class Lift extends ConcreteExercise {
    private ArrayList<ExerciseSet> exerciseSets;
    private final static int xp = 50;

    public Lift(Exercise exercise) {
        super(exercise);
        this.exerciseSets = new ArrayList<>();
    }

    @Override
    void accept(StatsCollector visitor) {
        visitor.visitLiftingExercise(this);
    }
    
    public ArrayList<ExerciseSet> getExerciseSets() {
        return exerciseSets;
    }

    public boolean addExerciseSet(ExerciseSet set) {
        return exerciseSets.add(set);
    }

    public boolean removeExerciseSet(ExerciseSet set) {
        return exerciseSets.remove(set);
    }

    public int getTotalReps() {
        int totalReps = 0;
        for(ExerciseSet set : exerciseSets) {
            totalReps += set.getReps();
        }
        return totalReps;
    }

    public int getXp() {
        return xp;
    }
}
