package com.sina.test;

import com.sina.cal.Calcuate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by muli1 on 16/6/7.
 */
@RunWith(Parameterized.class)
public class ParameterTest {

    private static Calcuate calcuate = new Calcuate();
    private int param1;
    private int param2;
    private int result;

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {2, 5, 7},
                {2, 6, 8},
                {389, 543, 932}
        });
    }

    public ParameterTest(int p1, int p2, int r){
        this.param1 = p1;
        this.param2 = p2;
        this.result = r;
    }

    @Test
    public void test(){
        assertEquals(result, calcuate.add(param1, param2));
    }


}
