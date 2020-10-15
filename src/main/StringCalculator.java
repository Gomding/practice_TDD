package main;

import main.to.Positive;

public class StringCalculator {
    public static int splitAndSum(String text) {
        if (isNullorEmpty(text)) {
            return 0;
        }
        return sum(toPositives(splitText(text)));
    }

    private static String[] splitText(String text) {
        return text.split(",|:");
    }

    private static boolean isNullorEmpty(String text) {
        return text == null || text.isEmpty();
    }

    private static int sum(Positive[] numbers) {
        Positive result = new Positive(0);
        for (Positive number : numbers) {
            result = result.add(number);
        }
        return result.getNumber();
    }

    private static Positive[] toPositives(String[] values) {
        Positive[] numbers = new Positive[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = new Positive(values[i]);
        }
        return numbers;
    }
}
