

import java.util.Scanner;
import java.lang.Math;

public class Code {

public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int count = pow(num);
    int[] array = new int[count];
    int result=0;
   
        for (int i = (count-1); i >= 0; i--) {
                array[i] = num % 10;
                num = num / 10;
        }

         

        for (int i=0; i<count-1; i++) {
                    result = array[count-1] - array[i] ;
                    array[count-1] = Math.abs(result);
        }

        System.out.println(array[count-1]);

}


public static int pow(int num) {
      int count = 1;

            while (num > 10) {
                num = num / 10;
                count++;
        }
                return count;


}


}