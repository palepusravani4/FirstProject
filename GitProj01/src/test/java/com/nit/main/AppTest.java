package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testSumWithPositives() {
    	AppMain app=new AppMain();
    	int exp=500;
    	int actual=app.sum(200,300);
        assertEquals(exp, actual);
    }
    @Test
    public void testSumWithNegatives() {
    	AppMain app=new AppMain();
    	int exp=-500;
    	int actual=app.sum(-200,-300);
        assertEquals(exp, actual);
    }
    @Test
    public void testSumWithMixedValues() {
    	AppMain app=new AppMain();
    	int exp=100;
    	int actual=app.sum(-200,300);
        assertEquals(exp, actual);
    }
    @Test
    public void testSumWithZeros() {
    	AppMain app=new AppMain();
    	int exp=0;
    	int actual=app.sum(0,0);
        assertEquals(exp, actual);
    }
    @Test
    public void testSumWithZeroAndPositive() {
    	AppMain app=new AppMain();
    	int exp=1;
    	int actual=app.sum(0,1);
        assertEquals(exp, actual);
    }
    
}
