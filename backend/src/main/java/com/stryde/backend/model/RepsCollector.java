package com.stryde.backend.model;

public class RepsCollector implements StatsCollector {
    private int totalReps;

    public RepsCollector() {
        this.totalReps = 0;
    }

    @Override
    public void visitLiftingExercise(Lift lift) {
        totalReps += lift.getTotalReps();
    }

    @Override
    public void visitCardioExercise(Cardio cardio) {
        totalReps += 0;
    }

    public int getTotalReps() {
        return totalReps;
    }
}
