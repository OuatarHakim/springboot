package com.ouatar.springboot.demo.myapp.common;

import com.ouatar.springboot.demo.myapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor "  + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minuts ";
    }


}
