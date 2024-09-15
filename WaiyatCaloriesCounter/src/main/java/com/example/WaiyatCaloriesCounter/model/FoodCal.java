package com.example.WaiyatCaloriesCounter.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "foodcal")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "foodcalId")
public class FoodCal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foodcalId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="userId")
    @JsonBackReference // Use BackReference here as this is the inverse of the relationship
    private User user;

    private Date date;
    private int totalCaloriesConsume;

    public FoodCal() {}

    public FoodCal(int foodcalId, User user, Date date, int totalCaloriesConsume) {
        this.foodcalId = foodcalId;
        this.user = user;
        this.date = date;
        this.totalCaloriesConsume = totalCaloriesConsume;
    }
    public int getFoodcalId() {return foodcalId;}
    public void setFoodcalId(int foodcalId) {this.foodcalId = foodcalId;}
    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public Date getDate() {return date;}
    public void setDate(Date date) {this.date = date;}
    public int getTotalCaloriesConsume() {return totalCaloriesConsume;}
    public void setTotalCaloriesConsume(int totalCaloriesConsume) {this.totalCaloriesConsume = totalCaloriesConsume;}
}
