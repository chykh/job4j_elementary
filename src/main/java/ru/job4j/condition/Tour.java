package ru.job4j.condition;

public class Tour {

    public static void offer(boolean passport) {
        System.out.println("A client has a foreign passport: " + passport);
        if (passport) {
            System.out.println("Tours abroad");
        } else {
            System.out.println("Tours Russia");
        }

    }

    public static void main(String[] args) {
    Tour.offer(true);
    Tour.offer(false);
    }
}
