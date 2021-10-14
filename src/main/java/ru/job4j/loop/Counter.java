package ru.job4j.loop;

/*
    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, 5));
        System.out.println(sum(1, 49));

        System.out.println(Counter.sumByEven(0, 10));
        System.out.println(Counter.sumByEven(3, 8));
        System.out.println(Counter.sumByEven(1, 1));
    }
 */

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int counter = start; counter <= finish; counter++) {
            sum = sum + counter;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int counter = start; counter <= finish; counter++) {
            if (counter % 2 == 0) {
                sum = sum + counter;
            }
        }
        return sum;
    }
}
