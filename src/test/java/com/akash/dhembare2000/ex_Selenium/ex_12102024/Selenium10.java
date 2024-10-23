package com.akash.dhembare2000.ex_Selenium.ex_12102024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium10 {
    @Test
    public void testQuitVsClose(){
        EdgeDriver driver=new EdgeDriver(); // Dynamic Dispatch -> Runtime Poly
        driver.get("https://sdet.live");

        // driver.close();
        // Close the Current Browser Window - not the full browser
        // Closed the window, Session id != null, Error - Invalid session ID

        driver.quit();
        // Close all the /sessions/windows and stop the browser
        //        driver.quit(); // Closed All the window and Session = null, Error - Session ID is null
    }
}
