package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then2()    {
        int[] data = {6, 3, 15, -7, 8, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, 5);
        int expected = 2;
        Assert.assertNotEquals(result, expected);
    }
}