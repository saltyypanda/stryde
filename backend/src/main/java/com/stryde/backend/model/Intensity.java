package com.stryde.backend.model;

public enum Intensity {
    LOW(5),
    MEDIUM(7),
    HIGH(10);

    public final int multiplicityFactor;

    private Intensity(int multiplicityFactor) {
        this.multiplicityFactor = multiplicityFactor;
    }
}
