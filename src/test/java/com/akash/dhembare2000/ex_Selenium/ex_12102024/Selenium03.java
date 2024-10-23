package com.akash.dhembare2000.ex_Selenium.ex_12102024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium03 {

@Test
    public void Test001(){
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://sdet.live");
    driver.quit(); // Close the driver instance created

}


}