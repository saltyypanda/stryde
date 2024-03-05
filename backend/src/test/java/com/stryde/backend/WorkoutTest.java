package com.stryde.backend;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.stryde.backend.model.exercise.Cardio;
import com.stryde.backend.model.exercise.CardioExercise;
import com.stryde.backend.model.exercise.ConcreteExercise;
import com.stryde.backend.model.exercise.Exercise;
import com.stryde.backend.model.exercise.Intensity;
import com.stryde.backend.model.user.Workout;

@Tag("Model-tier")
public class WorkoutTest {
    @Test
    public void testAddExercise() {
        //setup
        Workout workout = new Workout();
        Exercise exercise = new CardioExercise("Jogging", "Run like there's still a tommorow!", Intensity.MEDIUM);
        Cardio cardio = new Cardio(exercise);
        ArrayList<ConcreteExercise> exercises = workout.getExercises();

        //invoke
        workout.addExercise(cardio);
        
        //Analyze
        assertTrue(exercises.contains(cardio));
    }

    @Test
    public void testRemoveExercise() {
        //setup
        Workout workout = new Workout();
        Exercise exercise = new CardioExercise("Jogging", "Run like there's still a tommorow!", Intensity.MEDIUM);
        Cardio cardio = new Cardio(exercise);
        ArrayList<ConcreteExercise> exercises = workout.getExercises();

        //invoke
        workout.addExercise(cardio);
        workout.removeExercise(cardio);
        
        //Analyze
        assertFalse(exercises.contains(cardio));
    }
}
