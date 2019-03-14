package com.qaagility.controller;

import com.qaagility.javaee.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class CalcTest {

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void testCalc() {
        assertEquals("Result", 9, 9);
      }

	@Test	
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }
	
	Calcmul testcalcmul= new Calcmul();
	Calculator testcalculator =new Calculator();

	assertEquals(testcalcmul.mul(),18);
	assertEquals(testcalculator.add(),9);
	assertEquals(testcalculator.add(20,20),40);
	assertEquals(testcalculator.add(25,20),45);

    }
