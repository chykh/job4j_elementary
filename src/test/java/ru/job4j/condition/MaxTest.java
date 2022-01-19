package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenLeft4Right2Max4() {
        int left = 4;
        int right = 2;
        int expect = 4;
        Assert.assertEquals(Max.max(left, right), expect);
    }

    @Test
    public void whenLeft1Right3Max3() {
        int left = 1;
        int right = 3;
        int expect = 3;
        Assert.assertEquals(Max.max(left, right), expect);
    }

    @Test
    public void whenLeft5Right5Max5() {
        int left = 5;
        int right = 5;
        int expect = 5;
        Assert.assertEquals(Max.max(left, right), expect);
    }

    @Test
    public void when456then6() {
        int left = 4;
        int center = 5;
        int right = 6;
        int expected = 6;
        Assert.assertEquals(Max.max(left, center, right), expected);
    }

    @Test
    public void when8765then8() {
        int left = 8;
        int center = 7;
        int right = 6;
        int addit = 5;
        int expected = 8;
        Assert.assertEquals(Max.max(left, center, right, addit), expected);
    }

    @Test
    public void when17125then12() {
        int left = 1;
        int center = 7;
        int right = 12;
        int addit = 5;
        int expected = 12;
        Assert.assertEquals(Max.max(left, center, right, addit), expected);
    }
}