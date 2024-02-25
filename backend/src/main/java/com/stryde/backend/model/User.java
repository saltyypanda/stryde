package com.stryde.backend.model;

import java.time.LocalDate;
import java.util.TreeSet;

public class User {
    private int id;
    private String username;
    private String email;
    private int height;
    private double weight;
    private LocalDate birthDate;
    private WeightGoal weightGoal;
    private Routine currentRoutine;
    private TreeSet<Routine> routines;
    private int totalXP;
    
    public User(int id, String username, String email, int height, double weight, LocalDate birthDate, WeightGoal weightGoal) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
        this.weightGoal = weightGoal;
        this.routines = new TreeSet<>();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public WeightGoal getWeightGoal() {
        return weightGoal;
    }

    public Routine getCurrentRoutine() {
        return currentRoutine;
    }

    public TreeSet<Routine> getRoutines() {
        return routines;
    }

    public int getTotalXP() {
        return totalXP;
    }
}
