package org.example.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting021_Assertions {
    //TestNG Assertions
    //ER == AR
    //HARD ASSERTION - break the program
    //Soft assertion -

//    @Test
//    public void test_hardAssertExample(){
//        System.out.println("Start of the program");
//        Assert.assertTrue(false);
//        System.out.println("End of the program");
//    }

    @Test
    public void test_softAssertExample(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        System.out.println("This line will be executed");
        softAssert.assertAll();
    }
}
