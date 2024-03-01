package com.stryde.backend.model.collectors;

import com.stryde.backend.model.exercise.Cardio;
import com.stryde.backend.model.exercise.Lift;

public interface StatsCollector {
    void visitLiftingExercise(Lift lift);
    void visitCardioExercise(Cardio cardio);
}
