package com.example.today.common;

import org.springframework.stereotype.Component;

@Component
public class MoldovanChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Reteta moldoveneasca a zilei.";
    }

    @Override
    public String arataNumeleRestaurantului() {
        return "Nume Restaurant Moldovenesc";
    }
}
