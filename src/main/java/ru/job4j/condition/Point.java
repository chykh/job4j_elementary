package ru.job4j.condition;

public class Point {
    public static double distance(int x, int y, int x2, int y2) {
        //sqrt( (x2-x1)^2 + (y2-y2)^2)
        double first = x2 - x;
        first = Math.pow(first, 2);
        double second = y2 - y;
        second = Math.pow(second, 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
