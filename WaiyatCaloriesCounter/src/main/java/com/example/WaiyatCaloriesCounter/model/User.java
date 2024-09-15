package com.example.WaiyatCaloriesCounter.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="users")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String firstname;
    private String lastname;
    private double weight;
    private String gender;
    private int age;
    private double height;
    @Column(unique = true)
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference // Use ManagedReference here since User owns the relationship
    private List<Activity> activities;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private  List<FoodCal> foodCals;

    public User() {}

    public User(int userId, String firstname, String lastname, double weight, String gender, int age, double height, String username, String password, List<Activity> activities, List<FoodCal> foodCals) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.username = username;
        this.password = password;
        this.activities = activities;
        this.foodCals = foodCals;
    }

    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}
    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public List<Activity> getActivities() {return activities;}
    public void setActivities(List<Activity> activities) {this.activities = activities;}
    public List<FoodCal> getFoodCals() {return foodCals;}
    public void setFoodCals(List<FoodCal> foodCals) {this.foodCals = foodCals;}
}
