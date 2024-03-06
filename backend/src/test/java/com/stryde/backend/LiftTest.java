package com.stryde.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.stryde.backend.model.exercise.ExerciseSet;
import com.stryde.backend.model.exercise.Lift;
import com.stryde.backend.model.exercise.LiftingExercise;

@Tag("Model-tier")
public class LiftTest {
    @Test
    public void testAddExerciseSet() {
        //setup
        LiftingExercise Exercise = new LiftingExercise("Olympic weights", "Gotta be the best, the very best");
        Lift lift = new Lift(Exercise);
        ExerciseSet set = new ExerciseSet(10, 50);
        ArrayList<ExerciseSet> sets = lift.getExerciseSets();

        //invoke
        lift.addExerciseSet(set);

        //Anaylze
        assertTrue(sets.contains(set));
    }

    @Test
    public void testRemoveExerciseSet() {
        //setup
        LiftingExercise Exercise = new LiftingExercise("Olympic weights", "Gotta be the best, the very best");
        Lift lift = new Lift(Exercise);
        ExerciseSet set = new ExerciseSet(10, 50);
        ArrayList<ExerciseSet> sets = lift.getExerciseSets();

        //invoke
        lift.addExerciseSet(set);
        lift.removeExerciseSet(set);

        //Anaylze
        assertFalse(sets.contains(set));
    }

    @Test
    public void testGetTotalReps() {
        //setup
        LiftingExercise Exercise = new LiftingExercise("Olympic weights", "Gotta be the best, the very best");
        Lift lift = new Lift(Exercise);
        ExerciseSet set = new ExerciseSet(10, 50);
        lift.addExerciseSet(set);
        ExerciseSet secondSet = new ExerciseSet(15, 50);
        lift.addExerciseSet(secondSet);

        int expected = 25;

        //invoke
        int actual = lift.getTotalReps();

        //Anaylze
        assertEquals(expected, actual);
    }
}
