package com.example.selfintroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {
    public static void main(String[] args) {
        //Invoking browser
        //Chrome - ChromeDriver ->Methods close
        // Firefox  - FireFoxDriver -> Methods close
        //Safari SafariDriver -> methods close
        //Webdriver close get
        //WebDriver methods + class methods

        // chromedriver.exe --> Chrome browser
        //

        //SeleniumManger
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}



