package main;

public class StringCalculator {
    public static int splitAndSum(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] values = text.split(",|:");
        return sum(toInts(values));
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
