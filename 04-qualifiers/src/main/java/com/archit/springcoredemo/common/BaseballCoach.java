package com.archit.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Baseball Coach Daily Workout: Spend 30 Minutes in Daily Practice.";
    }
}
