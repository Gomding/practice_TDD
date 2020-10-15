package main;

public class StringCalculator {
    public static int splitAndSum(String text) {
        if (isNullorEmpty(text)) {
            return 0;
        }
        return sum(toInts(splitText(text)));
    }

    private static String[] splitText(String text) {
        return text.split(",|:");
    }

    private static boolean isNullorEmpty(String text) {
        return text == null || text.isEmpty();
    }

    private static int sum(int[] values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }

    private static int[] toInts(String[] values) {
        int size = values.length;
        int[] intValues = new int[size];
        for (int i = 0; i < size; i++) {
            intValues[i] = Integer.parseInt(values[i]);
        }
        return intValues;
    }

}
