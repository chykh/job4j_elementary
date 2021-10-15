package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        if (ivan <= 0 || nik <= 0 || ivan >= nik) {
            System.out.println("некорректные исходные данные");
            return 0;
        }
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month += 1;
        }
        System.out.println("Тяга Ивана " + ivan + " Тяга Николая " + nik);
        return month;
    }

    public static void main(String[] args) {
        System.out.println("месяц " + Fitness.calc(90, 100));
        System.out.println("месяц " + Fitness.calc(2, 70));
        System.out.println("месяц " + Fitness.calc(0, -100));
        System.out.println("месяц " + Fitness.calc(2, 3));
    }

}
