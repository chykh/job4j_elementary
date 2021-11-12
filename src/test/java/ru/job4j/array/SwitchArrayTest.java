package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = SwitchArray.swap(input, 1, 2);
        int[] expected = {1, 3, 2, 4, 5};
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void whenSwap4to1() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = SwitchArray.swap(input, 4, 0);
        int[] expected = {5, 2, 3, 4, 1};
        Assert.assertArrayEquals(result, expected);
    }
}