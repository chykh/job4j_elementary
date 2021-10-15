package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {

        boolean prime = true;
        if (number <= 1) {
            return false;
        }
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                prime = false;
                break;
            }
            i += 1;
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(CheckPrimeNumber.check(5));
        System.out.println(CheckPrimeNumber.check(4));
        System.out.println(CheckPrimeNumber.check(13));
        System.out.println(CheckPrimeNumber.check(-7));
        System.out.println(CheckPrimeNumber.check(18));
    }

}
