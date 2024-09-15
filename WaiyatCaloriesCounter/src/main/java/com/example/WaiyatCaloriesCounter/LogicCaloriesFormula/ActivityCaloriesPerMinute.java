package com.example.WaiyatCaloriesCounter.LogicCaloriesFormula;

import java.util.HashMap;

public class ActivityCaloriesPerMinute {
    HashMap<String, Double> activityCaloriesMap = new HashMap<>();

    public ActivityCaloriesPerMinute() {
        activityCaloriesMap.put("Running", 600 / 60.0);         // Calories burned per minute
        activityCaloriesMap.put("Yoga", 200 / 60.0);            // Calories burned per minute
        activityCaloriesMap.put("Weightlifting", 400 / 60.0);   // Calories burned per minute
        activityCaloriesMap.put("Crossfit", 700 / 60.0);        // Calories burned per minute
        activityCaloriesMap.put("Jogging", 400 / 60.0);         // Calories burned per minute
        activityCaloriesMap.put("Walking", 300 / 60.0);         // Calories burned per minute
    }

    public HashMap<String, Double> getActivityCaloriesMap() {
        return activityCaloriesMap;
    }
}
