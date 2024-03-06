package com.stryde.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.stryde.backend.model.exercise.Cardio;
import com.stryde.backend.model.exercise.CardioExercise;
import com.stryde.backend.model.exercise.ExerciseTime;
import com.stryde.backend.model.exercise.Intensity;

@Tag("Model-tier")
public class CardioTest {
    @Test
    public void testAddExerciseTime() {
        //setup
        CardioExercise Exercise = new CardioExercise("Jogging", "Gotta run run run", Intensity.MEDIUM);
        Cardio cardio = new Cardio(Exercise);
        ExerciseTime time = new ExerciseTime(3600, 600);
        ArrayList<ExerciseTime> times = cardio.getExerciseTimes();

        //invoke
        cardio.addExerciseTime(time);

        //Anaylze
        assertTrue(times.contains(time));
    }

    @Test
    public void testRemoveExerciseSet() {
        //setup
        CardioExercise Exercise = new CardioExercise("Jogging", "Gotta run run run", Intensity.MEDIUM);
        Cardio cardio = new Cardio(Exercise);
        ExerciseTime time = new ExerciseTime(3600, 600);
        cardio.addExerciseTime(time);
        ArrayList<ExerciseTime> times = cardio.getExerciseTimes();

        //invoke
        cardio.removeExerciseTime(time);

        //Anaylze
        assertFalse(times.contains(time));
    }

    @Test
    public void testGetTotalReps() {
        //setup
        CardioExercise Exercise = new CardioExercise("Jogging", "Gotta run run run", Intensity.MEDIUM);
        Cardio cardio = new Cardio(Exercise);
        ExerciseTime time = new ExerciseTime(3600, 600);
        cardio.addExerciseTime(time);
        ExerciseTime secondtime = new ExerciseTime(1800, 300);
        cardio.addExerciseTime(secondtime);

        int expected = 5400;

        //invoke
        int actual = cardio.getTotalTime();

        //Anaylze
        assertEquals(expected, actual);
    }
}
