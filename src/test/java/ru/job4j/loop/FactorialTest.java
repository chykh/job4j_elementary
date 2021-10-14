package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void when5calc120() {
        int n = 5;
        int expected = 120;
        Assert.assertEquals(expected, Factorial.calc(n));
    }

    @Test
    public void when0calc1() {
        int n = 0;
        int expected = 1;
        Assert.assertEquals(expected, Factorial.calc(n));
    }
}