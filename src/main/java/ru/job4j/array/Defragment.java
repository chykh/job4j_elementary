package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        int target = i;
                        array[point] = array[target];
                        array[target] = null;
                        break;
                    }
                }
            }
            System.out.println(array[index] + " ");
        }
        return array;
    }
}
