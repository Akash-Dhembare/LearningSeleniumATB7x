package com.akash.dhembare2000.ex_Selenium.ex_12102024;

import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium11 {
    // get vs Navigate.to()

    public static void main(String[] args) throws MalformedURLException {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://sdet.live");
        // No back, forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
