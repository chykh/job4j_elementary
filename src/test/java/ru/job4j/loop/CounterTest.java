package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void when2and5sum14() {
        int start = 2;
        int finish = 5;
        int expected = 14;
        Assert.assertEquals(14, Counter.sum(start, finish));
    }

    @Test
    public void when0and10sumByEven30() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        Assert.assertEquals(expected, Counter.sumByEven(start, finish));
    }

    @Test
    public void when10and16sumByEven52() {
        int start = 10;
        int finish = 16;
        int expected = 52;
        Assert.assertEquals(expected, Counter.sumByEven(start, finish));
    }
}