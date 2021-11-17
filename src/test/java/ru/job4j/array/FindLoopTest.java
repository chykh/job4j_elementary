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
    public void whenArrayHasNO5ThenMinus1()    {
        int[] data = {6, 3, 15, -7, 8, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, 5);
        int expected = -1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);

    }

        @Test
        public void whenArrayHasLength5Then0() {
            int[] data = new int[] {5, 10, 3};
            int el = 5;
            int result = FindLoop.indexOf(data, el);
            int expected = 0;
            Assert.assertEquals(expected, result);
        }
}