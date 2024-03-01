package com.stryde.backend.model.collectors;

import com.stryde.backend.model.exercise.Cardio;
import com.stryde.backend.model.exercise.Lift;

public class xpCollector implements StatsCollector {
    private int totalXP;

    public xpCollector() {
        this.totalXP = 0;
    }

    @Override
    public void visitLiftingExercise(Lift lift) {
        totalXP += lift.getXp();
    }

    @Override
    public void visitCardioExercise(Cardio cardio) {
        totalXP += cardio.getXp();
    }

    public int getTotalXP() {
        return totalXP;
    }
}
