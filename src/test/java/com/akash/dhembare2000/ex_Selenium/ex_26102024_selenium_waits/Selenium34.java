package com.akash.dhembare2000.ex_Selenium.ex_26102024_selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium34 {
    @Description("MMT")
    @Test
    public void make_my_trip_popup_handling(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver=new EdgeDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        //Condition
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebElement closeModal=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
