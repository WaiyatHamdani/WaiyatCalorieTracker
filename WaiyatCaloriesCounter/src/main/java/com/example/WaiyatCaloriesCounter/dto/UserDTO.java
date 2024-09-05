package com.example.WaiyatCaloriesCounter.dto;


import com.example.WaiyatCaloriesCounter.model.CalorieGoal;
import com.example.WaiyatCaloriesCounter.model.Exercise;

import java.util.List;

public class UserDTO {
    private int userId;
    private String firstname;
    private String lastname;
    private double weight;
    private String gender;
    private int age;
    private String username;
    private String password;
    private List<Exercise> exercise;
    private CalorieGoal goal;
    public UserDTO() {}

    public UserDTO(int userId, String firstname, String lastname, double weight, String gender, int age, String username, String password, List<Exercise> exercise, CalorieGoal goal) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.username = username;
        this.password = password;
        this.exercise = exercise;
        this.goal = goal;
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
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public List<Exercise> getExercise() {return exercise;}
    public void setExercise(List<Exercise> exercise) {this.exercise = exercise;}
    public CalorieGoal getGoal() {return goal;}
    public void setGoal(CalorieGoal goal) {this.goal = goal;}
}
