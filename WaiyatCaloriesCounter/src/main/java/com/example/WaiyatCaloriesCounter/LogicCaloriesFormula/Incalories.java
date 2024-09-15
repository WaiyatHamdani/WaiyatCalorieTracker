package com.example.WaiyatCaloriesCounter.LogicCaloriesFormula;

public class Incalories {
    private double weight;
    private double height;
    private double age;
    public Incalories() {}

    public Incalories(double weight, double height, double age) {
        this.weight = weight;
        this.height = height;
        this.age = age;
    }


    public double maleCalInKgCm(){
        //BMR=88.362+(13.397×weight in kg)+(4.799×height in cm)−(5.677×age in year)
        double result =88.362+(13.397*weight)+(4.799*height)-(5.677*age);
        return result;
    }

    public double femaleCalInKgCm(){
        //BMR=447.593+(9.247×weight in kg)+(3.098×height in cm)−(4.330×age in years)
        double result =447.593+(9.247*weight)+(3.098*height)-(4.330*age);
        return result ;
    }

    public double maleCalInLbInches(){
        //BMR=88.362+(6.23×weight in lb)+(12.7×height in inches)−(6.8×age in years)
        double result = 88.362+(6.23*weight)+(12.7*height)-(6.8*age);
        return result ;
    }

    public double femaleCalInLbInches(){
        //BMR=447.593+(4.35×weight in lb)+(4.7×height in inches)−(4.7×age in years)
        double result = 447.593+(4.35*weight)+(4.7*height)-(4.7*age);
        return result ;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
