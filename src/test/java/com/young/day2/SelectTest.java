package com.young.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTest {
    WebDriver driver;
    @BeforeMethod
    public void openChrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Idealprojects\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void selectTest(){
        driver.get("http:www.baidu.com");
        WebElement selectE1=driver.findElement(By.id(""));
        Select select=new Select(selectE1);
        select.selectByIndex(2);
        select.selectByValue("");
        select.selectByVisibleText("");


    }

    public void testWin(){
        driver.get("");
        driver.findElement(By.xpath("")).click();
        String handle1=driver.getWindowHandle();
        for (String handle: driver.getWindowHandles()){
            if(handle.equals(handle1)){
                continue;
            }else{
                driver.switchTo().window(handle);
            }
        }

        driver.findElement(By.id("")).click();
        driver.close();
        driver.switchTo().window(handle1);

    }



    @AfterMethod
    public void  closeChrome(){
        driver.quit();
    }
}
