package ir.ac.kntu;
import java.util.Arrays;

public class FiboString{

    public static void convertToFiboString(String content) {
        String [] arr = content.split("");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        convertToFiboString("Hello World");
    }
}