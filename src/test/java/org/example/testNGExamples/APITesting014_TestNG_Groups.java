package org.example.testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting014_TestNG_Groups {

    @Test(groups = {"sanity", "qa", "preprod"})
    public void sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"qa", "preprod", "reg"})
    public void RegRun() {
        System.out.println("Regression");
        Assert.assertTrue(true);
    }

    @Test(groups = {"dev", "stage"} )
    public void smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }

    @Test(groups = {"sanity", "qa", " preprod"})
    public void SanityRun1() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    public void RegRun2(){
        System.out.println("Reg");
        Assert.assertTrue(false);
    }

    @Test(groups = {"dev", "stage"})
    public void smokeRun3() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }

}
