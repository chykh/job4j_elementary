package ru.job4j.calculator;

public class MathFunc {

    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        if (x == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = func1(3);
        int result2 = func2(5);
        int result3 = func1(100);
        int total = result1 + result2;

        System.out.println("Total: " + total);
        System.out.println("Result3: " + result3);

        try {
            int errorTest = func2(0);
            System.out.println("This won't print: " + errorTest);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught error: " + e.getMessage());
        }
    }
}