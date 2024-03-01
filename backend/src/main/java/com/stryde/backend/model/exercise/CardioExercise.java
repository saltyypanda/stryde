package com.stryde.backend.model.exercise;

public class CardioExercise extends Exercise {
    private Intensity intensity;

    public CardioExercise(String name, String description, Intensity intensity) {
        super(name, description);
        this.intensity = intensity;
    }

    public Intensity getIntensity() {
        return intensity;
    }
}
