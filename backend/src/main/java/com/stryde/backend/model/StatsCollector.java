package com.stryde.backend.model;

public interface StatsCollector {
    void visitLiftingExercise(LiftingExercise lift);
    void visitCardioExercise(CardioExercise cardio);
}
