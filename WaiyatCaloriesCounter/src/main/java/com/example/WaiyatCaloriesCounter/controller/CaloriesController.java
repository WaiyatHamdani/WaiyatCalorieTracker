package com.example.WaiyatCaloriesCounter.controller;

import com.example.WaiyatCaloriesCounter.LogicCaloriesFormula.Incalories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "/calories")
public class CaloriesController {
    @PostMapping(path="/male")
    public ResponseEntity<Double> getMaleBMR(@RequestBody Incalories incalories){
        return new ResponseEntity<>(incalories.maleCalInLbInches(), HttpStatus.CREATED);
    }
    @PostMapping(path="/female")
    public ResponseEntity<Double> getFemaleBMR(@RequestBody Incalories incalories){
        return new ResponseEntity<>(incalories.femaleCalInLbInches(), HttpStatus.CREATED);
    }
}
