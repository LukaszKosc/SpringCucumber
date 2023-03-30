package com.test.data;

import com.beust.ah.A;
import com.test.config.ApiTestConfig;
import io.cucumber.spring.ScenarioScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApiData {
    public ApiData(){
        System.out.println("creating ApiData");
    }

    private String urlBase;

    public void setUrlBase(String urlBase) {
        System.out.println("linia nr 2");
        this.urlBase = urlBase;
    }

    public String getUrlBase() {
        return urlBase;
    }

}
