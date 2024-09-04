package com.example.WaiyatCaloriesCounter.model;

import java.util.Date;

public class DailyIntake {
    private int intakeID ;
    private int userID;
    private Date date;
    private String meal;
    private String food;
    private int calories;
    private double proteingram;
    private double carbsgram;
    private int servingsize;

    public DailyIntake() {}

    public DailyIntake(int intakeID, int userID, Date date, String meal, String food, int calories, double proteingram, double carbsgram, int servingsize) {
        this.intakeID = intakeID;
        this.userID = userID;
        this.date = date;
        this.meal = meal;
        this.food = food;
        this.calories = calories;
        this.proteingram = proteingram;
        this.carbsgram = carbsgram;
        this.servingsize = servingsize;
    }

    public int getIntakeID() {return intakeID;}
    public void setIntakeID(int intakeID) {this.intakeID = intakeID;}
    public int getUserID() {return userID;}
    public void setUserID(int userID) {this.userID = userID;}
    public Date getDate() {return date;}
    public void setDate(Date date) {this.date = date;}
    public String getMeal() {return meal;}
    public void setMeal(String meal) {this.meal = meal;}
    public String getFood() {return food;}
    public void setFood(String food) {this.food = food;}
    public int getCalories() {return calories;}
    public void setCalories(int calories) {this.calories = calories;}
    public double getProteingram() {return proteingram;}
    public void setProteingram(double proteingram) {this.proteingram = proteingram;}
    public double getCarbsgram() {return carbsgram;}
    public void setCarbsgram(double carbsgram) {this.carbsgram = carbsgram;}
    public int getServingsize() {return servingsize;}
    public void setServingsize(int servingsize) {this.servingsize = servingsize;}

}
