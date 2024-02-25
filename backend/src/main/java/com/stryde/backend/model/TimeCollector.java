package com.stryde.backend.model;

public class TimeCollector implements StatsCollector {
    //totalTime is in seconds
    private int totalTime;

    public TimeCollector() {
        this.totalTime = 0;
    }

    @Override
    public void visitLiftingExercise(Lift lift) {
        totalTime += 0;
    }

    @Override
    public void visitCardioExercise(Cardio cardio) {
        totalTime += cardio.getTotalTime();
    }

    public int getTotalTime() {
        return totalTime;
    }
}