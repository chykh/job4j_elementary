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
}