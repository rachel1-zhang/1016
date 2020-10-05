package com.young.day1;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2 {
    @Test
    public void assertEqualTest(){
        String a="asdf";
        String b="asdf";
        Assert.assertEquals("chenggong",a,b);
    }
}
