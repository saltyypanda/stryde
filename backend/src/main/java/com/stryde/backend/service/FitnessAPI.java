package com.stryde.backend.service;

import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.stryde.backend.model.user.ActivityLevel;
import com.stryde.backend.model.user.Sex;
import com.stryde.backend.model.user.WeightGoal;

import io.github.cdimascio.dotenv.Dotenv;

public class FitnessAPI {
    public static int getTargetCalories(int age, Sex sex, int height, double weight, ActivityLevel level, WeightGoal weightGoal) throws UnirestException {
        Dotenv dotenv = Dotenv.configure().directory("backend").load();
        String api_key = dotenv.get("RAPID_API_KEY");
        String url = "https://fitness-calculator.p.rapidapi.com/dailycalorie?age=" + age + "&gender=" + sex.toString()
                + "&height=" + height + "&weight=" + weight + "&activitylevel=" + level.toString();
        HttpResponse<JsonNode> response = Unirest.get(
                url)
                .header("X-RapidAPI-Key", api_key)
                .header("X-RapidAPI-Host", "fitness-calculator.p.rapidapi.com")
                .asJson();
        JSONObject result = response.getBody().getObject();
        JSONObject goals = result.getJSONObject("data").getJSONObject("goals");
        int calories = 0;
        switch(weightGoal) {
            case MAINTAIN_WEIGHT:
                calories = goals.getInt("maintain weight");
                break;
            case LOSE_WEIGHT:
                calories = goals.getJSONObject("Weight loss").getInt("calory");
                break;
            case GAIN_WEIGHT:
                calories = goals.getJSONObject("Weight gain").getInt("calory");
                break;
        }
        return calories;
    }

    //testing API functionality
    public static void main(String[] args) throws UnirestException {
        int c = FitnessAPI.getTargetCalories(25, Sex.MALE, 180, 71, ActivityLevel.LEVEL_3, WeightGoal.MAINTAIN_WEIGHT);
        System.out.println(c);
    }
}
