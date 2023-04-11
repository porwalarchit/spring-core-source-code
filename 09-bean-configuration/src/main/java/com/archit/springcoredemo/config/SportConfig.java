package com.archit.springcoredemo.config;

import com.archit.springcoredemo.common.Coach;
import com.archit.springcoredemo.common.CricketCoach;
import com.archit.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }

    @Bean
    public Coach cricketCoach(){
        return new CricketCoach();
    }
}
