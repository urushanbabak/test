package ir.ac.kntu;

import java.util.Arrays;

public class FiboString {

    public static String convertToFiboString(String content) {
        String[] arr = content.split(" ");
        int[] fibo = new int[arr.length];
        String[] result = new String[arr.length];
        String finish = "";
        String test = "";
        int k = 0;
        fibo[0] = 1;
        fibo[1] = 2;

        for (int i = 2; i < arr.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for (int i = 0; fibo[i] < arr.length; i++) {
            result[i] = arr[fibo[i] - 1];
            k++;
        }

        String[] new_result = Arrays.copyOf(result, k);
        finish = String.join(" ", new_result);
        return finish;
    }

    public static void main(String[] args) {
    }
}