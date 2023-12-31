package com.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void setupApplication()
    {

        Reporter.log("=====Browser Session Started=====", true);
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver,30);
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        Reporter.log("=====Application Started=====", true);
    }


    @AfterClass
    public void closeApplication()
    {
       driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }
}
