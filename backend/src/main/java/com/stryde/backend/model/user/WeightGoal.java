package com.stryde.backend.model.user;

public enum WeightGoal {
    LOSE_WEIGHT("Weight Loss"),
    MAINTAIN_WEIGHT("Maintain Weight"),
    GAIN_WEIGHT("Weight Gain");

    private String string;

    private WeightGoal(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
