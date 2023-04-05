package com.archit.springcoredemo.rest;

import com.archit.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    private String[] home(){
        return new String[]{"This is the Homepage of Primary", "/dailyworkout"};
    }

    // define a private field for the dependency
    private Coach myCoach;

    @Autowired
    public DemoController(
//            @Qualifier("baseballCoach")
                              Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
