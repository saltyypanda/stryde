package com.stryde.backend.model.collectors;

import com.stryde.backend.model.exercise.Cardio;
import com.stryde.backend.model.exercise.Lift;

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