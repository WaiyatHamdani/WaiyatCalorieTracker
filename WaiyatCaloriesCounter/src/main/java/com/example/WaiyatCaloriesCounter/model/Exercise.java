package com.example.WaiyatCaloriesCounter.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@Table(name ="exercise")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "exerciseId")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exerciseId;


    private String exerciseType;
    private int durationMinute;
    private int caloriesBurned;

    public Exercise() {
    }

    public Exercise(int caloriesBurned, int durationMinute, String exerciseType, int exerciseId) {
        this.caloriesBurned = caloriesBurned;
        this.durationMinute = durationMinute;
        this.exerciseType = exerciseType;
        this.exerciseId = exerciseId;
    }

    public int getExerciseId() {return exerciseId;}
    public void setExerciseId(int exerciseId) {this.exerciseId = exerciseId;}
    public String getExerciseType() {return exerciseType;}
    public void setExerciseType(String exerciseType) {this.exerciseType = exerciseType;}
    public int getDurationMinute() {return durationMinute;}
    public void setDurationMinute(int durationMinute) {this.durationMinute = durationMinute;}
    public int getCaloriesBurned() {return caloriesBurned;}
    public void setCaloriesBurned(int caloriesBurned) {this.caloriesBurned = caloriesBurned;}

}