package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        input = input + ' ';

        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (symbol == current) {
                counter++;
            } else  if (counter == 1) {
                result = result + symbol;
                symbol = current;
            } else {
                result = result + symbol + counter;
                symbol = current;
                counter = 1;
            }
        }
        return result;
    }

}
