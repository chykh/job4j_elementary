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
}