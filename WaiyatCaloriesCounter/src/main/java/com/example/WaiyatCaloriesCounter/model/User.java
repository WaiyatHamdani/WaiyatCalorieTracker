package com.example.WaiyatCaloriesCounter.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
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

    @Column(unique = true)
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonBackReference
    private List<Exercise> exercise;

    @OneToOne
    private CalorieGoal goal;

    @OneToMany(mappedBy = "user")
    @JsonBackReference
    private List<DailySummary> dailySummaries;

    public User() {}

    public User(int userId, String firstname, String lastname, double weight, String gender, int age, String username, String password, List<Exercise> exercise, CalorieGoal goal, List<DailySummary> dailySummaries) {
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
    public List<Exercise> getExercise() { return exercise; }
    public void setExercise(List<Exercise> exercise) { this.exercise = exercise; }
    public CalorieGoal getGoal() { return goal; }
    public void setGoal(CalorieGoal goal) { this.goal = goal; }
    public List<DailySummary> getDailySummaries() { return dailySummaries; }
    public void setDailySummaries(List<DailySummary> dailySummaries) { this.dailySummaries = dailySummaries; }
}
