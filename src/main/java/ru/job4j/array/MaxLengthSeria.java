package ru.job4j.array;

public class MaxLengthSeria {
       public static int find(int[] array) {
            int counter = 1;
            int numbs = 0;
            int rsl;
            int[] counts = new int[array.length];

            if (array.length == 1) {
                return 1;
            }
       for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                counter = counter + 1;
            } else {
                counts[numbs] = counter;
                numbs = numbs + 1;
                counter = 1;

            }
       counts[numbs] = counter;
       }
       rsl = counts[0];
  	   for (int i = 1; i < counts.length; i++) {
           rsl = (rsl > counts[i]) ? rsl : counts[i];
       }
       return rsl;
       }

    public static void main(String[] args) {
        int[] mass = {1, 2, 1, 1, 2, 3};
        MaxLengthSeria.find(mass);
        System.out.println(MaxLengthSeria.find(mass));
    }
}
