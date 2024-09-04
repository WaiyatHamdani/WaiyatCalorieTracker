package com.example.WaiyatCaloriesCounter.model;

public class Exercise {
    private int exerciseId;
    private User user;
    private String exerciseType;
    private int durationMinute;
    private int caloriesBurned;

    public Exercise() {
    }

    public Exercise(int exerciseId, User user, String exerciseType, int durationMinute, int caloriesBurned) {
        this.exerciseId = exerciseId;
        this.user = user;
        this.exerciseType = exerciseType;
        this.durationMinute = durationMinute;
        this.caloriesBurned = caloriesBurned;
    }

    public int getExerciseId() {return exerciseId;}
    public void setExerciseId(int exerciseId) {this.exerciseId = exerciseId;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public String getExerciseType() {return exerciseType;}
    public void setExerciseType(String exerciseType) {this.exerciseType = exerciseType;}
    public int getDurationMinute() {return durationMinute;}
    public void setDurationMinute(int durationMinute) {this.durationMinute = durationMinute;}
    public int getCaloriesBurned() {return caloriesBurned;}
    public void setCaloriesBurned(int caloriesBurned) {this.caloriesBurned = caloriesBurned;}
}
