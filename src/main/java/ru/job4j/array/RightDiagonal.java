package ru.job4j.array;

public class RightDiagonal {

    public static int[] diagonal(int[][] data) {
        int[] array = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            array[i] = data[i][data.length - 1 - i];
            System.out.println(array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] mass = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        RightDiagonal.diagonal(mass);

    }
}