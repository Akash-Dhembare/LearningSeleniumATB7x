package com.akash.dhembare2000.ex_Selenium.ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium24 {
    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"


    @Description("Verify that with invalid email and password error message is shown on app.vwo.com")
    @Test
    public void testVwoLoginNegative(){
        // How to find the elements
        // Selenium
        // ID, NAME, CLASS NAME, TAGName,
        // Advance -> Css Selector, Xpath

        //Preference Rule = Unique ID -> Name -> Class Name -> TagName -> Link Text / Partial Text -> CSS Selector -> XPath

        // If it is Dynamic or changes (We try to avoid that Locator) or if there are multiple classes
        // If it is not unique then we will avoid it.
        // Try to find shortest and easy to remember locator which doesn't change much.

        //<input type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi" data-gtm-form-interact-field-id="0">

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");


        // FindElement -> 1 Element first web element
        // FindElements -> which can find multiple web elements

        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        // 1. Find the email input box and enter the email
        WebElement emailInputBox=driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        // 2. Find the password input box and enter the password
        WebElement passwordInputBox=driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");

        // 3. Find the  login button and click on it
        WebElement buttonSubmit=driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        // After 3 seconds error message is coming

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message=driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

        driver.quit();

    }

}
