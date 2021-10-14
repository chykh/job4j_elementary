package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int number = n;
        if (n == 0) {
            return 1;
        }
        for (int counter = 1; counter < number; counter++) {
            n = counter * n;
        }
        return n;
    }
}
