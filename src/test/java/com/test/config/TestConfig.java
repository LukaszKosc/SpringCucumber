package com.test.config;

import io.cucumber.spring.ScenarioScope;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.test" })
public class TestConfig {

//    @Value("${remote.driver}")
//    private boolean useRemoteDriver;
//
//    @Value("${user.remote.driver.url}")
//    private String remoteUrl;

//    @Value("${user.remote.driver.capabilities}")
//    private Capabilities remoteCapabilities;
    @Bean
    @ScenarioScope
    public WebDriver webDriver() throws MalformedURLException {
        WebDriver driver = null;

        System.out.println("creating object webDriver here");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--headless");


        WebDriverManager.chromedriver().setup();
//        if (useRemoteDriver) {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//        chromeOptions.merge(capabilities);
//            driver = new RemoteWebDriver(new URL(remoteUrl), capabilities);
//        } else {
//            URL resource = getClass().getResource("/drivers/chromedriver.exe");
//            String path = resource.getPath();
//
//            System.setProperty("webdriver.chrome.driver", path);
//            driver = new ChromeDriver();
//        }

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}
