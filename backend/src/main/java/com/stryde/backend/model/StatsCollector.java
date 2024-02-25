package com.stryde.backend.model;

public interface StatsCollector {
    void visitLiftingExercise(Lift lift);
    void visitCardioExercise(Cardio cardio);
}
