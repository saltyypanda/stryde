package com.stryde.backend.model.exercise;

import java.util.ArrayList;

import com.stryde.backend.model.collectors.RepsCollector;
import com.stryde.backend.model.collectors.TimeCollector;
import com.stryde.backend.model.collectors.xpCollector;
import com.stryde.backend.model.user.Workout;

public class WorkoutSession {
    private Workout workout;
    private ArrayList<ConcreteExercise> completedExercises;

    public WorkoutSession(Workout workout) {
        this.workout = workout;
        this.completedExercises = new ArrayList<>();
    }

    public boolean completeExercise(ConcreteExercise exercise) {
        return completedExercises.add(exercise);
    }

    public int getTotalReps() {
        RepsCollector collector = new RepsCollector();
        for(ConcreteExercise exercise : completedExercises) {
            exercise.accept(collector);
        }
        return collector.getTotalReps();
    }

    public int getTotalTime() {
        TimeCollector collector = new TimeCollector();
        for(ConcreteExercise exercise : completedExercises) {
            exercise.accept(collector);
        }
        return collector.getTotalTime();
    }

    public int getTotalXP() {
        xpCollector collector = new xpCollector();
        for(ConcreteExercise exercise : completedExercises) {
            exercise.accept(collector);
        }
        return collector.getTotalXP();
    }

    public Workout getWorkout() {
        return workout;
    }
}
