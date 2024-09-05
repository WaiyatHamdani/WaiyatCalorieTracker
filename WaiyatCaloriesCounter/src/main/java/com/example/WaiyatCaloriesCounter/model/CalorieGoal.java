package com.example.WaiyatCaloriesCounter.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@Table(name ="caloriegoal")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "goalId")
public class CalorieGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int goalId;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
    private int calorieGoal;
    private String dateGoal;

    public CalorieGoal() {
    }

    public CalorieGoal(int goalId, User user, int dailyCalorieGoal, String dateSet) {
        this.goalId = goalId;
        this.user = user;
        this.calorieGoal = dailyCalorieGoal;
        this.dateGoal = dateSet;
    }

    public int getGoalId() {return goalId;}
    public void setGoalId(int goalId) {this.goalId = goalId;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public int getCalorieGoal() {return calorieGoal;}
    public void setCalorieGoal(int calorieGoal) {this.calorieGoal = calorieGoal;}
    public String getDateGoal() {return dateGoal;}
    public void setDateGoal(String dateGoal) {this.dateGoal = dateGoal;}
}
