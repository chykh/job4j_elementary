package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int size = 0;
        int[] rsl = new int[100];
        int[] coins = {10, 5, 2, 1};
        int change = money - price;

        for (int coin : coins) {
                while (change >= coin) {
                rsl[size++] = coin;
                change -= coin;
                }
        }
        return Arrays.copyOf(rsl, size);
    }
}
