package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        return length * height;
    }

    public static void main(String[] args) {
        int k = 2;
        int p = 6;
        double expected = 2.0;
        double real = SqArea.square(p, k);

        System.out.println("p = " + p + ", k = " + k + ", calculated area = " + real);
        System.out.println("Expected: " + expected);
        System.out.println("Test passed: " + (Math.abs(expected - real) < 0.0001));
    }
}
