package ru.job4j.array;

public class LengthArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива " + numbers[i].length);
            }
    }
}
