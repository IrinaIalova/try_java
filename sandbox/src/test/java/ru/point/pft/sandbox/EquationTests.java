package ru.point.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by iriska on 5/4/17.
 */
public class EquationTests {

    @Test
        public void test0() {
        Eqation e = new Eqation(1,1,1);
        Assert.assertEquals(e.rootnumber(), 0);
    }

    @Test
    public void test1() {
        Eqation e = new Eqation(1,2,1);
        Assert.assertEquals(e.rootnumber(), 1);
    }

    @Test
    public void test2() {
        Eqation e = new Eqation(1,5,6);
        Assert.assertEquals(e.rootnumber(), 2);
    }








}
