package com.example.WaiyatCaloriesCounter.LogicCaloriesFormula;

public class Incalories {

    private double result;
    public Incalories() {}


    public double maleCalInKgCm(double kg , double cm , int age){
        //BMR=88.362+(13.397×weight in kg)+(4.799×height in cm)−(5.677×age in year)
        result =88.362+(13.397*kg)+(4.799*cm)-(5.677*age);
        return result;
    }

    public double femaleCalInKgCm(double kg , double cm , int age){
        //BMR=447.593+(9.247×weight in kg)+(3.098×height in cm)−(4.330×age in years)
        result =447.593+(9.247*kg)+(3.098*cm)-(4.330*age);
        return result;
    }

    public double maleCalInLbInches(double pound, double inches, int age){
        //BMR=88.362+(6.23×weight in lb)+(12.7×height in inches)−(6.8×age in years)
        result = 88.362+(6.23*pound)+(12.7*inches)-(6.8*age);
        return result;
    }

    public double femaleCalInLbInches(double pound, double inches, int age){
        //BMR=447.593+(4.35×weight in lb)+(4.7×height in inches)−(4.7×age in years)
        result = 447.593+(4.35*pound)+(4.7*inches)-(4.7*age);
        return result;
    }

}
