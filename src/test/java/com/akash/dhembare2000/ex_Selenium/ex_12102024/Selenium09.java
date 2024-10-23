package com.akash.dhembare2000.ex_Selenium.ex_12102024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;

public class Selenium09 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addExtensions(new File("src/test/java/com/akash/dhembare2000/ex_Selenium/Adblock.crx"));

        EdgeDriver driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get("https://sdet.live");
    }
}
