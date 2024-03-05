package com.stryde.backend;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.stryde.backend.model.user.Routine;
import com.stryde.backend.model.user.Workout;

@Tag("Model-tier")
public class RoutineTest {
    @Test
    public void testAddWorkout() {
        //setup
        Routine routine = new Routine();
        Workout firstWorkout = new Workout();
        Workout secondWorkout = new Workout();
        ArrayList<Workout> workouts = routine.getWorkouts();

        //invoke
        routine.addWorkout(firstWorkout);
        routine.addWorkout(secondWorkout);

        //Analyze
        assertTrue(workouts.contains(firstWorkout));
        assertTrue(workouts.contains(secondWorkout));
    }

    @Test
    public void testRemoveWorkout() {
        //setup
        Routine routine = new Routine();
        Workout firstWorkout = new Workout();
        Workout secondWorkout = new Workout();
        ArrayList<Workout> workouts = routine.getWorkouts();

        //invoke
        routine.addWorkout(firstWorkout);
        routine.addWorkout(secondWorkout);
        routine.removeWorkout(secondWorkout);

        //Analyze
        assertTrue(workouts.contains(firstWorkout));
        assertTrue(!workouts.contains(secondWorkout));
    }
}
