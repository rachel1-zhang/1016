package com.young.day1;

import org.testng.annotations.*;

public class TestNGDemo1 {
    @BeforeTest
    public void beforeTest01(){
        System.out.println("这是@beforetest的注解");

    }
    @BeforeMethod
    public void beforeMethod01(){
        System.out.println("这是@beforeMethod的注解");

    }

    @Test
    public void testCase1(){
        System.out.println("这是@test case1的注解");
    }
    @Test
    public void testCase2(){
        System.out.println("这是@test case2的注解");

    }
    @AfterMethod
    public void afterMethod01(){
        System.out.println("这是@aftermethod的注解");

    }

    @AfterTest
    public void afterTest01(){
        System.out.println("这是@aftertest的注解");

    }
}
