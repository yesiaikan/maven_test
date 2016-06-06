package com.sina.test;

import junit.extensions.TestSetup;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import junit.framework.Test;

/**
 * Created by muli1 on 16/6/6.
 */
public class TestManager {

    public static Test suite(){
        TestSuite suite = new TestSuite("test method");

        suite.addTest(new JUnit4TestAdapter(SimpleTest.class));
        suite.addTest(new JUnit4TestAdapter(CalcuateTest.class));
        suite.addTest(new JUnit4TestAdapter(InterfaceTest.class));


        return new ResourceTestSetup(suite);
    }



    static class ResourceTestSetup extends TestSetup {

        public ResourceTestSetup(Test test) {
            super(test);
        }

        @Override
        protected void setUp() throws Exception {
            //TODO  启动服务
        }


        @Override
        protected void tearDown() throws Exception {
        }
    }

}

