package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return notPositive(num) || isEven(num);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(LogicNot.isEven(a));
        System.out.println(LogicNot.isPositive(a));
        System.out.println(LogicNot.notEven(a));
        System.out.println(LogicNot.notPositive(a));
        System.out.println(LogicNot.notEvenAndPositive(a));
        System.out.println(LogicNot.evenOrNotPositive(a));

        a = -6;
        System.out.println(LogicNot.isEven(a));
        System.out.println(LogicNot.isPositive(a));
        System.out.println(LogicNot.notEven(a));
        System.out.println(LogicNot.notPositive(a));
        System.out.println(LogicNot.notEvenAndPositive(a));
        System.out.println(LogicNot.evenOrNotPositive(a));
    }
}
