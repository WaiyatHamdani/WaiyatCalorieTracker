package com.example.WaiyatCaloriesCounter.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "intake")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "intakeID")
public class Intake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int intakeID ;
    @ManyToOne
    @JoinColumn(name = "summaryId")
    @JsonManagedReference
    private DailySummary dailySummary;
    private String meal;
    private String food;
    private int calories;
    private double proteingram;
    private double carbsgram;
    private int servingsize;

    public Intake() {}

    public Intake(int intakeID, DailySummary dailySummary, String meal, String food, int calories, double proteingram, double carbsgram, int servingsize) {
        this.intakeID = intakeID;
        this.dailySummary = dailySummary;
        this.meal = meal;
        this.food = food;
        this.calories = calories;
        this.proteingram = proteingram;
        this.carbsgram = carbsgram;
        this.servingsize = servingsize;
    }

    public int getIntakeID() {return intakeID;}
    public void setIntakeID(int intakeID) {this.intakeID = intakeID;}
    public DailySummary getDailySummary() {return dailySummary;}
    public void setDailySummary(DailySummary dailySummary) {this.dailySummary = dailySummary;}
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
