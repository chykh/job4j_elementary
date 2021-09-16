package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rls = l * h;
        return rls;
    }

    public static void main(String[] args) {
        int k = 2;
        int p = 6;
        double real = SqArea.square(p, k);

        System.out.println(" p = 6, k = 2 , s = " + 2 + ", real  = " + real);
    }
}
