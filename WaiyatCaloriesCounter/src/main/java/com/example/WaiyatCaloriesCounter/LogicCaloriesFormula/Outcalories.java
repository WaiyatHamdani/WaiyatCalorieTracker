package com.example.WaiyatCaloriesCounter.LogicCaloriesFormula;

import java.util.HashMap;

/*
*=============TDEE Formula=====================================
*TDEE for Males:
*TDEE=BMR(for male)×Activity Factor
*
*TDEE for Females:
*TDEE=BMR (for female)×Activity Factor
*==============================================================
*
*
*=====Activity Level===================Activity Factor====================
*Sedentary (little or no exercise) ->	BMR × 1.2
*Lightly active (light exercise/sports 1-3 days/week) ->	BMR × 1.375
*Moderately active (moderate exercise/sports 3-5 days/week) ->	BMR × 1.55
*Very active (hard exercise/sports 6-7 days a week) -> BMR × 1.725
*Extra active (very hard exercise & a physical job) -> BMR × 1.9
*=========================================================================
* */
public class Outcalories {
    private HashMap<String, Double> activityfactor = new HashMap<>();
    private double result;
    public Outcalories() {
        activityfactor.put("sedentary",1.2);
        activityfactor.put("lightly_active", 1.375);
        activityfactor.put("moderately_active", 1.55);
        activityfactor.put("very_active", 1.725);
        activityfactor.put("extra_active", 1.9);
    }

    public double maleactivity(double bmr, String afactor){
        result = 1884.77*activityfactor.get(afactor);
        return result;
    }

    public double femaleactivity(double bmr, String afactor){
        result = 1381.44*activityfactor.get(afactor);
        return result ;
    }

    public HashMap<String, Double> getActivityfactor() {
        return activityfactor;
    }

    public void setActivityfactor(HashMap<String, Double> activityfactor) {
        this.activityfactor = activityfactor;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
