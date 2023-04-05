package com.archit.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "CricketCoach Class: Practice fast bowling for 15 minutes.";
    }
}
