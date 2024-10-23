package com.akash.dhembare2000.ex_Selenium.ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumHomeWork1 {
    @Description("Navigate to the Page - https://awesomeqa.com/ui/index.php?route=account/register , Fill the form and Click continue - Verify that- Your Account Has Been Created!")
    @Test
    public void Awsomeqa_Register(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized--");

        WebDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Register Account");
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/ui/index.php?route=account/register");

        WebElement firstname= driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("Akash");

        WebElement lastname= driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Dhembare");

        WebElement email= driver.findElement(By.id("input-email"));
        email.sendKeys("akash.dheeambare1212343@gmail.com");

        WebElement telephone= driver.findElement(By.id("input-telephone"));
        telephone.sendKeys("79764321324");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("Akash@1234");

        WebElement confirm_password= driver.findElement(By.id("input-confirm"));
        confirm_password.sendKeys("Akash@1234");

        List<WebElement> newsletter_Sub_list= driver.findElements(By.name("newsletter"));
        newsletter_Sub_list.get(0).click();

        WebElement policy_checkbox=driver.findElement(By.name("agree"));
        policy_checkbox.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement submit=driver.findElement(By.className("btn-primary"));
        submit.click();


        WebElement success_message=driver.findElement(By.id("content"));
        System.out.println(success_message.getText());

        Assert.assertEquals(success_message.getText(), "Your Account Has Been Created!\n" +
                "Congratulations! Your new account has been successfully created!\n" +
                "You can now take advantage of member privileges to enhance your online shopping experience with us.\n" +
                "If you have ANY questions about the operation of this online shop, please e-mail the store owner.\n" +
                "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.\n" +
                "Continue");

        driver.quit();


    }
}
