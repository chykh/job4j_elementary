package ru.job4j.array;

public class Defragment {

    public static String[] swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        int target = i;
                        Defragment.swap(array, point, target);
                        break;
                    }

                }
            }
            System.out.println(array[index] + " ");
        }
        return array;
    }
}
