package com.akash.dhembare2000.ex_Selenium.ex_26102024_selenium_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium36_InputBox_CheckBox_RadioBox {
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");


        // InputBox
        driver.findElement(By.name("firstname")).sendKeys("Akash");
        driver.findElement(By.name("lastname")).sendKeys("Dhembare");
        driver.findElement(By.id("datepicker")).sendKeys("26/10/2024");

        // Radio Button
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-3")).click();

        // CheckBox
        driver.findElement(By.id("profession-0")).click();
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-1")).click();
        driver.findElement(By.id("tool-2")).click();

        // Dropdown
        WebElement element_select=driver.findElement(By.id("continents"));
        Select select=new Select(element_select);
        // select.selectByVisibleText("Australia");
        select.selectByIndex(5);






    }
}
