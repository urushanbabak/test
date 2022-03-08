package ir.ac.kntu;
import java.util.Arrays;

public class ContactBook {

    public static void format(String text) {
        String [] result = text.split("name");
        System.out.println(Arrays.toString(result));
    }

    public static void main (String[] args){
        format ("name=  Ali *  family = Mohammadi*phone=09876543210");
    }

}