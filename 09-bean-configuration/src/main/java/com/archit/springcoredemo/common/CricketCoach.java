package com.archit.springcoredemo.common;

public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Cricket Coach advice is to practice fielding.";
    }
}
