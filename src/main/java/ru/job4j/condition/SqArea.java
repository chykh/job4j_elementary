package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl = p / (2 * (k + 1));
        return rsl;
    }

    public static void main(String[] args) {
        int k = 2;
        int p = 6;
        double h = SqArea.square(p, k);
        double l = h * k;
        double s = l * h;
        System.out.println(" p = 6, k = 2 / h = " + h + ", l = " + l + ", s = " + s);
    }
}
