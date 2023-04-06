package com.archit.springcoredemo.common;

public class SwimCoach implements Coach {
    public SwimCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Swim Coach advice is to swim for 30 minutes.";
    }
}
