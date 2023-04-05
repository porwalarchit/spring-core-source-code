package com.archit.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Tennis Coach Daily Workout: Practice your backhand volley.";
    }
}
