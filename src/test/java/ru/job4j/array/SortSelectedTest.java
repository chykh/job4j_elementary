package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {
    @Test
    public void when5Sort() {
        int[] data = new int[] {3, 4, 1, 2, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when3Sort() {
        int[] data = {8, -3, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-3, 2, 8};
        Assert.assertArrayEquals(result, expected);
    }

}