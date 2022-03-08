package ir.ac.kntu;

public class NumberConverter {

    public static String convertNumbers(int input) {
      
    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    if (i > 25) {
        return null;
    }
    return Character.toString(alphabet[i]);

    }

    public static void main(String[] args) {
        convertNumbers(10);

    }
}