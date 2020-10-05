package com.young.day3;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionTest {
    WebDriver driver;
    @BeforeMethod
    public void openChrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Idealprojects\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public void clickTest01(){

        driver.get("http://www.baidu.com");
        driver.manage().window().maximize();
        new WebDriverWait(driver,5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"s-top-left\"]/a[1]")));
        WebElement clicks=driver.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[1]"));
        clicks.click();

        String url=driver.getCurrentUrl();
        System.out.println(url);

        new WebDriverWait(driver,5).until(ExpectedConditions.presenceOfElementLocated(By.name("description")));
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("百度新闻——海量中文资讯平台",title);



    }

    @Test
    public void clickTest02() throws InterruptedException {
        driver.get("http://www.baidu.com");
        //Thread.sleep(20000);
        driver.manage().window().maximize();
        WebElement keys=driver.findElement(By.id("kw"));
        keys.sendKeys("selenium");
        WebElement buttons=driver.findElement(By.id("su"));
        buttons.click();
        //String url=driver.getCurrentUrl();
        new WebDriverWait(driver,5).until(ExpectedConditions.titleIs("selenium_百度搜索"));
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("selenium_百度搜索",title);
        //System.out.println(url);
        //Assert.assertEquals("http://news.baidu.com/",url);
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
