package org.example.testNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting017_TestNG_Parameter {

    @Parameters("browser")
    @Test
    void demo1(String value) {
        System.out.println("Browser is" + value);
        //open browser and select data
        if (value.equalsIgnoreCase("chrome")) {
            System.out.println("Start My Testing");
        }
        if (value.equalsIgnoreCase("firefox")) {
            System.out.println("Start My firefox");
        }
    }
}
