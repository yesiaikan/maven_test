package com.sina.test;

import com.sina.cal.Calcuate;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by muli1 on 16/6/6.
 */
public class CalcuateTest {

    public static Calcuate calcuate;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("--------------- START ---------------");
        calcuate = new Calcuate();
        System.out.println("init calcuate");
    }

    @Test
    public void testAdd(){
        assertEquals(9, calcuate.add(3, 6));
    }

    @Test
    public void testMinus(){
        assertNotEquals(0, calcuate.minus(3, 2));
        assertFalse(6 == 5);
    }

    @Test
    public void testDivide(){
        assertEquals(3, calcuate.divide(12, 4));
    }

    @Test
    public void testMull(){
        assertEquals(15, calcuate.mull(3, 5));
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("--------------- END ---------------");
    }
}
