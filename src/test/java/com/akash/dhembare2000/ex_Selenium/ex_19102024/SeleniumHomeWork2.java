package com.akash.dhembare2000.ex_Selenium.ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumHomeWork2 {

    WebDriver driver=new EdgeDriver();


    @Description("Fetch the locators - https://app.vwo.com/ and Validate Username and Password")
    @Test
    public void validate_credentials(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());


        WebElement username=driver.findElement(By.id("login-username"));
        username.sendKeys("akash@gmail.com");

        WebElement password=driver.findElement(By.id("login-password"));
        password.sendKeys("Akash@2000");

        WebElement signin_button=driver.findElement(By.id("js-login-btn"));
        signin_button.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

    @Description("Verify name on dashboard page.")
    @Test
    public void verify_login_success(){
        WebElement valid_user_login= driver.findElement(By.className("page-sub-title"));
        System.out.println(valid_user_login.getText());

        Assert.assertEquals(valid_user_login.getText(), "Hi Akash Dhembare, here's an overview of your experience optimization journey");

        driver.quit();
    }

}
