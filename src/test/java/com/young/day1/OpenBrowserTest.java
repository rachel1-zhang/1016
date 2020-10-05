package com.young.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenBrowserTest {
    @Test
    public void openFF(){
        WebDriver driver=new FirefoxDriver();
    }

    @Test
    public void openChrome(){
        WebDriver driver=new ChromeDriver();
    }
}
