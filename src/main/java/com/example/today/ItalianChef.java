package com.example.today;

import org.springframework.stereotype.Component;

@Component

public class ItalianChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pomodoro " +
                "with fresh tomatoes and basil!";

    }

}
