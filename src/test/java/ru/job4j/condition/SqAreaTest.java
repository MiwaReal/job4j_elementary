package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K2Dot5Square5Dot1() {
        double expected = 5.1;
        int p = 10;
        double k = 2.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1000K99Square2475() {
        int expected = 2475;
        int p = 1000;
        double k = 99;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}