package org.example.testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting019_TestNG_AlwaysRun {


    @Test(alwaysRun = true)
    public void test01(){
        Assert.assertTrue(true);
    }

    @Test
    public void test02(){
        Assert.assertTrue(true);
    }

    @Test
    public void test03(){
        Assert.assertTrue(true);
    }
}
