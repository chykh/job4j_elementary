package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int a = 2;
        int b = middle.length / 2;
        int c = right.length / 2;
        int[] mass = new int[a + b + c];
        System.out.println(mass.length);
        System.out.println();
        mass[0] = left[0];
        mass[mass.length - 1] = left[left.length - 1];
        for (int i = 1; i < mass.length - 1; i++) {
            if (i % 2 == 0) {
                mass[i] = middle[i - 1];
            } else {
            mass[i] = right[i - 1];
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        return mass;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4, 5};
        int[] middle = {6, 7, 8, 9, 10};
        int[] right = {11, 12, 13, 14, 15, 16};
        UnionThreeArrays.union(left, middle, right);
    }
}