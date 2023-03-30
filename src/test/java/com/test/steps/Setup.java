package com.test.steps;

import com.test.data.ApiData;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class Setup {

//    @Autowired
//    private WebDriver driver;

    @Autowired
    private ApiData apiData;
    @Before
    public void setup() {
        System.out.println("running before class");
    }
    
}
