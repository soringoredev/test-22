package com.example.today;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    private Chef myChef;

    //Constructor

    @Autowired
    public DemoController(Chef theChef) {
        myChef = theChef;
    }

}
