package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2Then1() {
        int left = 555;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 555;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2ThenEqual() {
        int left = 666;
        int right = 666;
        int result = Max.max(left, right);
        int expected = 666;
        Assert.assertEquals(result, expected);
    }
}