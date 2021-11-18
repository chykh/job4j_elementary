package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int indexMin = FindLoop.indexOf(data, min);

            int temp = data[index];
            data[index] = min;
            data[indexMin] = temp;
        }
        return data;
    }
}
