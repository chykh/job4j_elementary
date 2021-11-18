package ru.job4j.loop;

public class Circle {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Значение индекса внешнего цикла: " + i + " значение внутреннего: " + j);
                count += 1;
            }
        }
        System.out.println("Кол-во итераций " + count);
    }
}
