package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int sum = 0;
        int counter = 0;
        while (sum + section <= length) {
            sum = sum + section;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(SectionCount.count(1, 1));
    }
}