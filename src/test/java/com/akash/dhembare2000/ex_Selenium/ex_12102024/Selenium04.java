package com.akash.dhembare2000.ex_Selenium.ex_12102024;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium04 {
    @Test
    public void testMethod(){
        // Important OOPs Concept ->
        // Upcasting -> Dynamic Dispatch

        // In Selenium 3 -
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // In Selenium 4
        // Opera Remove - No usage of the setProperty

       //  WebDriver driver = new EdgeDriver();
////        WebDriver driver2 = new ChromeDriver();
////        WebDriver driver3 = new FirefoxDriver();
////        WebDriver driver4 = new InternetExplorerDriver();
////        WebDriver driver5 = new SafariDriver();


        //        SearchContext(I) (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15) -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)
        //        SearchContext(I) -> WebDriver(I) -> RemoteWebDriver(C) -> ChromiumDriver(C) -> ChromeDriver(C)


        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

        // Selenium - Arch - API
        // Create Session, Commands or Functions -> API Request to Browser Driver (
        // Pass the commands as API


          SearchContext driver=new ChromeDriver();
          WebDriver driver1=new ChromeDriver();
          RemoteWebDriver driver2= new ChromeDriver();
          driver2=new EdgeDriver();


          ChromeDriver driver3=new ChromeDriver();


        // Scenarios
        // 1. Do want to run on  Chrome or Edge?
        //ChromeDriver driver = new ChromeDriver(); ~1%

        // 2  Do you want to run on Chrome then change to Edge ?
        // WebDriver driver = new ChromeDriver();
        // driver = new EdgeDriver(); 97% -


        // 3. do you want to run on multiple browsers, aws machine, ? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)


    }
}