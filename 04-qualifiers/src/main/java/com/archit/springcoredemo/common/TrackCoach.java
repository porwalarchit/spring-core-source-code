package com.archit.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Track Coach Daily Workout: Run a hard 5k!.";
    }
}
