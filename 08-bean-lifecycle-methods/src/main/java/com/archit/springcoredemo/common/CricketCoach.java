package com.archit.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    //define the init methods
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMayStartupStuff(): " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "CricketCoach Class: Practice fast bowling for 15 minutes.";
    }
}
