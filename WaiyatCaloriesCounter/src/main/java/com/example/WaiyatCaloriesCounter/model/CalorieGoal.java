package com.example.WaiyatCaloriesCounter.model;

public class CalorieGoal {
    private int goalId;
    private User user;
    private int dailyCalorieGoal;
    private String dateSet;

    public CalorieGoal() {
    }

    public CalorieGoal(int goalId, User user, int dailyCalorieGoal, String dateSet) {
        this.goalId = goalId;
        this.user = user;
        this.dailyCalorieGoal = dailyCalorieGoal;
        this.dateSet = dateSet;
    }

    public int getGoalId() {return goalId;}
    public void setGoalId(int goalId) {this.goalId = goalId;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public int getDailyCalorieGoal() {return dailyCalorieGoal;}
    public void setDailyCalorieGoal(int dailyCalorieGoal) {this.dailyCalorieGoal = dailyCalorieGoal;}
    public String getDateSet() {return dateSet;}
    public void setDateSet(String dateSet) {this.dateSet = dateSet;}
}
