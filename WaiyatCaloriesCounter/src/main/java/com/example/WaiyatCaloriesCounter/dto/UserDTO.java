package com.example.WaiyatCaloriesCounter.dto;

import com.example.WaiyatCaloriesCounter.model.DailySummary;

import java.util.List;

public class UserDTO {
    private int userId;
    private String firstname;
    private String lastname;
    private double weight;
    private String gender;
    private int age;
    private double height;
    private String username;
    private String password;
    private List<DailySummary> dailySummaries;
    public UserDTO() {}

    public UserDTO(int userId, String firstname, String lastname, double weight, String gender, int age, double height, String username, String password, List<DailySummary> dailySummaries) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.username = username;
        this.password = password;
        this.dailySummaries = dailySummaries;
    }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public List<DailySummary> getDailySummaries() {
        return dailySummaries;
    }

    public void setDailySummaries(List<DailySummary> dailySummaries) {
        this.dailySummaries = dailySummaries;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
