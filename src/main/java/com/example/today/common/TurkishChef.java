package com.example.today.common;

import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "prepara un kebab cu carne de miel, servit cu pilaf de orez si iaurt.";
    }

}
