package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int size = 0;
        int[] rsl = new int[100];
        int[] coins = {10, 5, 2, 1};
        for (int i = 0; i < coins.length; i++) {
                while ((money - price - coins[i]) >= 0) {
                rsl[size] = coins[i];
                money = money - coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
