package com.example.WaiyatCaloriesCounter.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String firstname;
    private String lastname;
    private double weight;
    private String gender;
    private int age;

    @Column(unique = true)
    private String username;
    private String password;

    private String activity;
    private String goal;

    public User() {}

    public User(int userId, String firstname, String lastname, double weight, String gender, int age, String username, String password) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.username = username;
        this.password = password;
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
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getActivity() {return activity;}
    public void setActivity(String activity) {this.activity = activity;}
    public String getGoal() {return goal;}
    public void setGoal(String goal) {this.goal = goal;}
}
