package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < 100; i++) {
            rsl[i] = left[i] > right[i] ? left[i] : right[i];
        }
        return rsl;
    }
}
