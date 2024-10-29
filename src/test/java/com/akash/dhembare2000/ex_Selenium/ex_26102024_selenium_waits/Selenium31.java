package com.akash.dhembare2000.ex_Selenium.ex_26102024_selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium31 {
    @Description("Verify Ebay Print the prices (iMac)")
    @Test
    public void test_verify_print_imac_price(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // #gh-ac
        // input[id="gh-ac"] -> xpath -> //input[@id="gh-ac"]
        WebElement searchBox=driver.findElement(By.cssSelector("input[id='gh-ac']"));
        searchBox.sendKeys("macmini"); // Find the "macmini"

        WebElement searchBoxButton=driver.findElement(By.cssSelector("input[value='Search']"));
        searchBoxButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Print all the titles
        List<WebElement> searchTitles=driver.findElements(By.cssSelector(".s-item__title"));
        //div[@class="s-item__title"]/span -> 62

        List<WebElement> searchTitlesPrices=driver.findElements(By.cssSelector(".s-item__price"));
        //span[@class="s-item__price"] -> 61

        // .s-item__title > .s-item__price
        // min -> loop where
        int size=Math.min(searchTitles.size(),searchTitlesPrices.size());


        for (int i = 0; i < size; i++) {
            System.out.println("Title: " + searchTitles.get(i).getText() + " || " + "Price: " + searchTitlesPrices.get(i).getText());
            System.out.println();
        }


        driver.quit();
    }
}
