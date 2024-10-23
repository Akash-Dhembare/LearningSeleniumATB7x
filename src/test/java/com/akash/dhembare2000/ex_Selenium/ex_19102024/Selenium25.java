package com.akash.dhembare2000.ex_Selenium.ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium25 {
    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"


    @Description("Verify that with invalid email and password error message is shown on app.vwo.com")
    @Test
    public void testVwoLoginNegative() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--start-maximized");

        // FindElement -> 1 Element first web element
        // FindElements -> which can find multiple web elements

        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        // Link text - Full Match
        // and Partial - Contains - partial match
        // text only works with - a tag
        //<a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        // </a>

//        WebElement link_webEelement= driver.findElement(By.linkText("Start a free trial"));
//        link_webEelement.click();

        WebElement partial_link_webeelement= driver.findElement(By.partialLinkText("free trial"));
        partial_link_webeelement.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();
    }
}
