package com.briteERP.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauseLabs {


    public static final String USERNAME = "jacobe2019";
    public static final String ACCESS_KEY ="d37189a3-fdca-4a49-8c6c-80e23963c585";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";


    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = DesiredCapabilities.chrome();
       // caps.setCapability("platform","Mac OS X");
        caps.setCapability("platform","Linux");

        caps.setCapability("version", "latest");
        caps.setCapability("name", "GoogleTest1");
        caps.setCapability("extendedDebugging", "true");
        caps.setCapability("buildNumber", "3.0");




      //  WebDriver driver = new RemoteWebDriver(new URL(URL),caps);
        System.setProperty("webdriver.chrome.driver","/Users/wsgak/Downloads/chromedriver3");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("automation testing engineer");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.println(driver.getTitle());

        driver.quit();
        System.out.println("Test Completed");
    }



}
