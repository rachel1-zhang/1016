package com.young.day2;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTest {
    WebDriver driver;
    @BeforeMethod
    public void openChrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Idealprojects\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void waitTest(){
        driver.get("");
        driver.findElement(By.xpath("")).click();
        String text=driver.findElement(By.xpath("")).getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("")));
        Assert.assertEquals("",text);
    }

}
