package com.epam.task2_1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BallsCreatorTest {
    BallsCreator bc = new BallsCreator();

    @BeforeClass
    public void setUp() throws Exception {
        bc.addBalls();
    }

    @Test
    public void testGetCountBlueBalls() throws Exception {
        Assert.assertEquals(bc.getCountBlueBalls(), 2);
    }

    @Test
    public void testGetWeightBalls() throws Exception {
        Assert.assertEquals(bc.getWeightBalls(), 13);
    }
}