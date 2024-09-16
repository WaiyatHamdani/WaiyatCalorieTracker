package com.example.WaiyatCaloriesCounter.controller;

import com.example.WaiyatCaloriesCounter.LogicCaloriesFormula.ActivityCaloriesPerMinute;
import com.example.WaiyatCaloriesCounter.LogicCaloriesFormula.FoodCalories;
import com.example.WaiyatCaloriesCounter.LogicCaloriesFormula.Incalories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "/calories")
public class CaloriesController {
    @PostMapping(path="/male")
    public ResponseEntity<Double> getMaleBMR(@RequestBody Incalories incalories){
        //System.out.println("Received weight: " + incalories.getWeight());
        //System.out.println("Received height: " + incalories.getHeight());
        //System.out.println("Received age: " + incalories.getAge());
        return new ResponseEntity<>(incalories.maleCalInLbInches(), HttpStatus.CREATED);
    }
    @PostMapping(path="/female")
    public ResponseEntity<Double> getFemaleBMR(@RequestBody Incalories incalories){
        //System.out.println("Received weight: " + incalories.getWeight());
        //System.out.println("Received height: " + incalories.getHeight());
        //System.out.println("Received age: " + incalories.getAge());
        return new ResponseEntity<>(incalories.femaleCalInLbInches(), HttpStatus.CREATED);
    }

    @GetMapping(path = "/activityperminute")
    public ResponseEntity<HashMap<String,Double>> getallactivity(){
        ActivityCaloriesPerMinute activityCaloriesPerMinute = new ActivityCaloriesPerMinute();
        return new ResponseEntity<>(activityCaloriesPerMinute.getActivityCaloriesMap(),HttpStatus.OK);
    }
    @GetMapping(path = "/foods")
    public ResponseEntity<HashMap<String,Double>> getallfoods(){
        FoodCalories foodCalories = new FoodCalories();
        return new ResponseEntity<>(foodCalories.getTypeFood(),HttpStatus.OK);
    }
}
