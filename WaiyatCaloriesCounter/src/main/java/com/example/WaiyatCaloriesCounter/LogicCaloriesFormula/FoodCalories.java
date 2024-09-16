package com.example.WaiyatCaloriesCounter.LogicCaloriesFormula;

import java.util.HashMap;

public class FoodCalories {
    HashMap<String , Double> typeFood = new HashMap<>();

    public FoodCalories() {
        //korean
        typeFood.put("Bibimbap", 500.0);
        typeFood.put("Kimchi Jjigae", 300.0);
        typeFood.put("Bulgogi", 450.0);
        typeFood.put("Tteokbokki", 350.0);
        typeFood.put("Samgyeopsal", 600.0);
        typeFood.put("Pajeon", 400.0);

        //chinesse
        typeFood.put("Kung Pao Chicken", 500.0);
        typeFood.put("Sweet and Sour Pork", 450.0);
        typeFood.put("Fried Rice", 350.0);
        typeFood.put("Spring Rolls", 200.0);
        typeFood.put("General Tso's Chicken", 600.0);

        // american
        typeFood.put("Cheese Pizza slice", 280.0);
        typeFood.put("Pepperoni Pizza slice", 300.0);
        typeFood.put("Vegetarian Pizza slice", 250.0);
        typeFood.put("Meat Lovers Pizza slice", 350.0);
        typeFood.put("Hamburger", 500.0);
        typeFood.put("Hot Dog", 350.0);
        typeFood.put("French Fries", 300.0);
        typeFood.put("Fried Chicken", 400.0);
        typeFood.put("Mac and Cheese", 450.0);
        typeFood.put("Apple Pie", 320.0);
        typeFood.put("Caesar Salad", 350.0);

        // indonesian
        typeFood.put("Nasi Padang", 800.0);
        typeFood.put("Empek-empek", 300.0);
        typeFood.put("Batagor", 350.0);
        typeFood.put("Rendang", 600.0);
        typeFood.put("Nasi Goreng", 500.0);
        typeFood.put("Satay", 400.0);
        typeFood.put("Gado-Gado", 350.0);
        typeFood.put("Mie Goreng", 450.0);
        typeFood.put("Soto Ayam", 250.0);
    }

    public HashMap<String, Double> getTypeFood() {
        return typeFood;
    }
}
