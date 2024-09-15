package com.example.WaiyatCaloriesCounter.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "activity")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "activityId")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ActivityId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="userId")
    @JsonBackReference // Use BackReference here as this is the inverse of the relationship
    private User user;

    private Date date;
    private int totalCaloriesBurned;

    public Activity() {
    }

    public Activity(int activityId, User user, Date date, int totalCaloriesBurned) {
        ActivityId = activityId;
        this.user = user;
        this.date = date;
        this.totalCaloriesBurned = totalCaloriesBurned;
    }

    public int getActivityId() {return ActivityId;}
    public void setActivityId(int activityId) {ActivityId = activityId;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public Date getDate() {return date;}
    public void setDate(Date date) {this.date = date;}
    public int getTotalCaloriesBurned() {return totalCaloriesBurned;}
    public void setTotalCaloriesBurned(int totalCaloriesBurned) {this.totalCaloriesBurned = totalCaloriesBurned;}
}
