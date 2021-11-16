package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int v;
        if (array.length % 2 == 0) {
            for (int i = 0; i <= (array.length - 1) / 2; i++) {
                v = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = v;
            }
        }   else {
            for (int i = 0; i <= (array.length - 2) / 2; i++) {
                v = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = v;
            }
        }
        return array;
    }
}
