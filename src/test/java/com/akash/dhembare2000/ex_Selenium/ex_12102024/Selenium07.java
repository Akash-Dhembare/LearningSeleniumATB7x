package com.akash.dhembare2000.ex_Selenium.ex_12102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium07 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
