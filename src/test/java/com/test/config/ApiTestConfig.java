package com.test.config;

import com.test.data.ApiData;
import io.cucumber.spring.ScenarioScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.test" })
public class ApiTestConfig {
    public ApiTestConfig(){
        System.out.println("ApiTestConfig creator");
    }
    @Value("${api.url.base}")
    private String url;

    @Value("${api.url.races}")
    private String[] races;

    @Value("${api.url.tool}")
    private String tool;

    @Autowired
    private ApiData apiData;

    @Bean
    @ScenarioScope
//    public ApiData apiData(@Value("${api.url.base}") String localUrl){
    public ApiData apiData(){
        System.out.println("creating API test object here");
        apiData = new ApiData();
        apiData.setUrlBase(String.format("%s/[race]/%s", url, tool));
        return apiData;
    }

}
