/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shaan
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("im in the setupClass() function");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("im in the tearDownClass() function");
    }
    
    @Before
    public void setUp() {
        System.out.println("im in the setupClass() function");
    }
    
    @After
    public void tearDown() {
        System.out.println("im in the tearDownClass() function");
    }

    double[][] listOfNumsAdd = { {-5,-2,-7}, {-5,2,-3}, {2,-5,-3}, {-2,-5,-7}, {-600,-250,-850}, {-600,200,-400}, {200,-600,-400}, {600,250,850}};
    @Test
    public void testAdd() {
        System.out.println("add");
        for (int n = 0; n < (listOfNumsAdd.length - 1); n++) {
            double num1 = listOfNumsAdd[n][0];
            double num2 = listOfNumsAdd[n][1];
            double expResult = listOfNumsAdd[n][2];
            double result = Calculator.add(num1, num2);
            assertEquals(expResult, result, 0.0);
        }
        //fail("The test case is a prototype.");
    }

    double[][] listOfNumsSubtract = { {-5,-2,-3}, {-5,2,-7}, {2,-5,7}, {-2,-5,3}, {-600,-250,-350}, {-600,200,-800}, {200,-600,800}, {600,250,350}};
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        for (int n = 0; n < (listOfNumsSubtract.length - 1); n++) {
            double num1 = listOfNumsSubtract[n][0];
            double num2 = listOfNumsSubtract[n][1];
            double expResult = listOfNumsSubtract[n][2];
            double result = Calculator.subtract(num1, num2);
            assertEquals(expResult, result, 0.0);
        }
                //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double num1 = 5.0;
        double num2 = 4.0;
        double expResult = 20.0;
        double result = Calculator.multiply(num1, num2);
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        float num1 = 20.0F;
        float num2 = 10.0F;
        double expResult = 2.0;
        double result = Calculator.divide(num1, num2);
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    } 
}
