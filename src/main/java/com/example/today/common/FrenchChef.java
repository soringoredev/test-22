package com.example.today.common;

import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef{

    @Override
    public String getDailyRecipe() {
        return "Preparez un boeuf bourgignon aved des legumes ./.. ";
    }
}
