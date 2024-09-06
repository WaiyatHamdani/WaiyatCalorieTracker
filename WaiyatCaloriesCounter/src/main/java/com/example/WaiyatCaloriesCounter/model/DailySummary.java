package com.example.WaiyatCaloriesCounter.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dailysummary")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "summaryId")
public class DailySummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int summaryId;

    @ManyToOne
    @JoinColumn(name ="userId")
    @JsonBackReference // Use BackReference here as this is the inverse of the relationship
    private User user;

    private String date;
    private int totalCaloriesConsumed;
    private int totalCaloriesBurned;
    private int dailyCalorieGoal;

    public DailySummary() {
    }

    public DailySummary(int summaryId, User user, String date, int totalCaloriesConsumed, int totalCaloriesBurned, int dailyCalorieGoal) {
        this.summaryId = summaryId;
        this.user = user;
        this.date = date;
        this.totalCaloriesConsumed = totalCaloriesConsumed;
        this.totalCaloriesBurned = totalCaloriesBurned;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    public int getSummaryId() {return summaryId;}
    public void setSummaryId(int summaryId) {this.summaryId = summaryId;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}
    public int getTotalCaloriesConsumed() {return totalCaloriesConsumed;}
    public void setTotalCaloriesConsumed(int totalCaloriesConsumed) {this.totalCaloriesConsumed = totalCaloriesConsumed;}
    public int getTotalCaloriesBurned() {return totalCaloriesBurned;}
    public void setTotalCaloriesBurned(int totalCaloriesBurned) {this.totalCaloriesBurned = totalCaloriesBurned;}
    public int getDailyCalorieGoal() {return dailyCalorieGoal;}
    public void setDailyCalorieGoal(int dailyCalorieGoal) {this.dailyCalorieGoal = dailyCalorieGoal;}
}
