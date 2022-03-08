package ir.ac.kntu;
import java.util.Scanner;
import java.util.Arrays;
public class NumberConverter {

    public static String convertNumbers(String input) {
        String [] result = input.split(",");
        String [] arr = {"zero","one","two","three","four","five","six",
        "seven","eight","nine","ten","eleven","twelve","thirteen",
        "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one",
        "twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven",
        "twenty eight","twenty nine","thirty","thirty one","thirty two","thirty three","thirty four",
        "thirty five","thirty six","thirty seven","thirty eight","thirty nine","fourty","foury one",
        "forty two","forty three","forty four","forty five","forty six","forty seven",
        "forty eight","forty nine","fifty"};

        for (int i=0;i<result.length;i++){
            
            if (result[i].matches("\\d{2}") || result[i].matches("\\d{1}")){
                result[i]=arr[Integer.parseInt(result[i])];
            }

            else{
                for(int j=0;j<arr.length;j++){
                    if (result[i].equals(arr[j])){
                        result[i]=String.valueOf(j);
                    }
                }
            }


        }
        String new_result =  String.join(",", result);

        return new_result;
    }

    public static void main(String[] args) {
       System.out.println(convertNumbers("45,thirty four,2"));
    }
}