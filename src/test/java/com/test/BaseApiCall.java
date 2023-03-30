package com.test;

import com.test.data.ApiData;
import io.cucumber.java.Before;
import io.cucumber.spring.ScenarioScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class BaseApiCall {
    public BaseApiCall(){
        System.out.println("creating BaseApiCall");
    }
    @Autowired
    private ApiData apiData;

}
