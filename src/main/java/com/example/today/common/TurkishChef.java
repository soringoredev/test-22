package com.example.today.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "prepara un kebab cu carne de miel, servit cu pilaf de orez si iaurt.";
    }

    @Override
    public String arataNumeleRestaurantului() {
        return "Nume Restaurant Turcesc";
    }

    @Override
    public String getChefName() {
        return "Ibrahim";
    }

    @Override
    public double getSalary() {
        return 3000;
    }

    @Override
    public String getMenuOfTheDay() {
        return "";
    }

}
