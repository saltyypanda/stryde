package com.stryde.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.stryde.backend.model.exercise.Cardio;
import com.stryde.backend.model.exercise.CardioExercise;
import com.stryde.backend.model.exercise.ConcreteExercise;
import com.stryde.backend.model.exercise.ExerciseSet;
import com.stryde.backend.model.exercise.ExerciseTime;
import com.stryde.backend.model.exercise.Intensity;
import com.stryde.backend.model.exercise.Lift;
import com.stryde.backend.model.exercise.LiftingExercise;
import com.stryde.backend.model.exercise.WorkoutSession;
import com.stryde.backend.model.user.Workout;

@Tag("Model-tier")
public class WorkoutSessionTest {
    @Test
    public void testCompleteExercise() {
        //setup
        CardioExercise exercise = new CardioExercise("Marathon training", "Gotta be the best, the very best", Intensity.HIGH);
        Cardio cardio = new Cardio(exercise);
        Workout workout = new Workout();
        workout.addExercise(cardio);
        WorkoutSession session = new WorkoutSession(workout);
        ArrayList<ConcreteExercise> completedExercises = session.getCompletedExercises();

        //invoke
        session.completeExercise(cardio);

        //Analyze
        assertTrue(completedExercises.contains(cardio));
    }

    @Test
    public void testGetTotalReps() {
        //setup
        LiftingExercise exercise = new LiftingExercise("Olympic weights", "Gotta be the best, the very best");
        Lift lift = new Lift(exercise);
        ExerciseSet set = new ExerciseSet(10, 50);
        lift.addExerciseSet(set);
        Workout workout = new Workout();
        workout.addExercise(lift);
        WorkoutSession session = new WorkoutSession(workout);
        int expected = 10;

        //invoke
        session.completeExercise(lift);
        int actual = session.getTotalReps();

        //Analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTotalTime() {
        //setup
        CardioExercise exercise = new CardioExercise("Marathon training", "Gotta be the best, the very best", Intensity.HIGH);
        Cardio cardio = new Cardio(exercise);
        ExerciseTime time = new ExerciseTime(3600, 600);
        cardio.addExerciseTime(time);
        Workout workout = new Workout();
        workout.addExercise(cardio);
        WorkoutSession session = new WorkoutSession(workout);
        int expected = 3600;

        //invoke
        session.completeExercise(cardio);
        int actual = session.getTotalTime();

        //Analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTotalXP() {
        //setup
        CardioExercise firstExercise = new CardioExercise("Marathon training", "Gotta be the best, the very best", Intensity.HIGH);
        Cardio cardio = new Cardio(firstExercise);
        ExerciseTime time = new ExerciseTime(3600, 600);
        cardio.addExerciseTime(time);

        LiftingExercise secondExercise = new LiftingExercise("Olympic weights", "Gotta be the best, the very best");
        Lift lift = new Lift(secondExercise);
        ExerciseSet set = new ExerciseSet(10, 50);
        lift.addExerciseSet(set);

        Workout workout = new Workout();
        workout.addExercise(cardio);
        workout.addExercise(lift);

        WorkoutSession session = new WorkoutSession(workout);

        int expected = 100;
        
        //invoke
        session.completeExercise(cardio);
        session.completeExercise(lift);
        int actual = session.getTotalXP();

        //Analyze
        assertEquals(expected, actual);
    }
}
