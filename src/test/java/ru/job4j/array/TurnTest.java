package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class TurnTest {

    @Test
    public void when12345Then54321() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void when4162Then2614() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] expected = new int[]{2, 6, 1, 4};
        int[] result = Turn.back(input);
        Assert.assertArrayEquals(result, expected);
    }
}