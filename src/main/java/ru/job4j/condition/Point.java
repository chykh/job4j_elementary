package ru.job4j.condition;

public class Point {
    public static double distance(int x, int y, int x2, int y2) {
        //sqrt( (x2-x1)^2 + (y2-y2)^2)
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
