package com.example.today.common;

import org.springframework.stereotype.Component;

@Component
public class MexicanChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Prepara tacos al pastor con pina, cilangtro y salsa ...";
    }
}
