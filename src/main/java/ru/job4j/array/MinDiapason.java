package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
