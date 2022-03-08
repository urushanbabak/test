package ir.ac.kntu;

import java.util.Arrays;

public class ArrayReverse {

    public static void reverse(String[] array){
        int len = array.length;
        String temp = new String("");
        for(int i = len-1,j=0; 2*j < len; i--,j++){
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    }
    public static void main(String[] args) {
        reverse(args);
        //show reversed array
        System.out.println("args = "+ Arrays.toString(args));
    }
}