package com.sina.test;

import org.junit.*;


/**
 * Created by muli1 on 16/6/6.
 *
 * Junit运行过程
 */
public class SimpleTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @Before
    public void before(){
        System.out.println("before");
    }

    @Test
    public void testSimple(){
        System.out.println("testSimple");
    }

    @Test
    public void testSimple1(){
        System.out.println("testSimple1");
    }

    @Test
    public void testSimple2(){
        System.out.println("testSimple2");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");

    }

}
