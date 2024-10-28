package com.akash.dhembare2000.ex_Selenium.ex_20102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework {
    @Description("Login with valid username and password - https://app.vwo.com/#/login and Verify the Dashboard.  - Dashboard")
    @Test
    public void test_success_login(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement username=driver.findElement(By.cssSelector("input[id='login-username']"));
        username.sendKeys("akash@gmail.com");

        WebElement password=driver.findElement(By.xpath("//input[@id='login-password']"));
        password.sendKeys("Akash@2000");

        WebElement signin_button=driver.findElement(By.xpath("//button[@id='js-login-btn']"));
        signin_button.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement dashboard_heading=driver.findElement(By.cssSelector("h1[class='page-heading']"));
        System.out.println(dashboard_heading.getText());

        Assert.assertEquals(dashboard_heading.getText(),"Dashboard");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
