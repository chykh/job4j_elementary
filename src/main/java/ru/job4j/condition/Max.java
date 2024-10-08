package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int center, int right) {
        int result = max(left, max(center, right));
        return result;
    }

    public static int max(int left, int center, int right, int addit) {
        int result = max(addit, max(left, center, right));
        return result;
    }

    public static void main(String[] args) {
        int check = Max.max(5, 14);
        System.out.println(check);
        check = Max.max(12, 8);
        System.out.println(check);
    }
}
