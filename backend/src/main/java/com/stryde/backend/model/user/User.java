package com.stryde.backend.model.user;

import java.time.LocalDate;
import java.time.Period;
import java.util.TreeSet;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.stryde.backend.service.FitnessAPI;

public class User {
    private int id;
    private String username;
    private String email;
    private int height;
    private double weight;
    private double targetWeight;
    private LocalDate birthDate;
    private WeightGoal weightGoal;
    private Routine currentRoutine;
    private TreeSet<Routine> routines;
    private int totalXP;
    private Sex sex;
    private ActivityLevel activityLevel;
    
    public User(int id, String username, String email, int height, double weight, double targetWeight, LocalDate birthDate, WeightGoal weightGoal, Sex sex, ActivityLevel activityLevel) {
        this.id = id;
        this.username = username;
        this.email = email;
        //HEIGHT must be in cm for API to work, we can change it through algorithm if needed
        this.height = height; //Cannot be smaller than 130 or bigger than 230
        //WEIGHT must be in kg, for API, we can change it through code if needed
        this.weight = weight; //Cannot be smaller than 40 or bigger than 160
        this.birthDate = birthDate;
        this.weightGoal = weightGoal;
        this.routines = new TreeSet<>();
        this.sex = sex;
        this.targetWeight = targetWeight;
        this.activityLevel = activityLevel;
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

    public Sex getSex() {
        return sex;
    }

    public double getTargetWeight() {
        return targetWeight;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public int getTargetCalories() throws UnirestException {
        LocalDate curDate = LocalDate.now();  
        int age = Period.between(birthDate, curDate).getYears();
        return FitnessAPI.getTargetCalories(age, sex, height, weight, activityLevel, weightGoal);
    }
}
