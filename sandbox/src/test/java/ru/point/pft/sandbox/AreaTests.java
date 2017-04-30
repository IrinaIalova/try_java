package ru.point.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by iriska on 4/30/17.
 */
public class AreaTests {

    @Test
    public void testArea(){
        Point a = new Point(0.0,0.0);
        Point b = new Point(0.0,3.0);
        Assert.assertEquals(a.distance(b), 3.0);
        System.out.println("Test one is OK");

        Point c = new Point(3.0,1.0);
        Point d = new Point(2.0,1.0);
        Assert.assertEquals(c.distance(d), 1.0);
        System.out.println("Test two is OK");
    }
}

