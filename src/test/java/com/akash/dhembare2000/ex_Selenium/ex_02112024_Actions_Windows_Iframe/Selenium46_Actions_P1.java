package com.akash.dhembare2000.ex_Selenium.ex_02112024_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class Selenium46_Actions_P1 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){
        EdgeOptions options=new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver=new EdgeDriver(options);

    }


    @Description("Verify Actions")
    @Test
    public void test_actions(){
        driver.manage().window().maximize();
        String URL="https://awesomeqa.com/practice.html";
        driver.get(URL);

        WebElement firstname=driver.findElement(By.name("firstname"));
        // Keyboards -> KeyDown -> Shift -> send key -> KeyUp

        Actions actions=new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname, "akash dhembare").keyUp(Keys.SHIFT).build().perform();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void closeBrowser(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
