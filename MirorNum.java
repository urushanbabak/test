package ir.ac.kntu;

import java.util.Scanner;
import java.util.Arrays;

public class MirorNum {

public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = num;
        int count = pow(num);
        int numbers[] = new int [count];
        int twoNumbers[] = new int[1000];
        int threeNumbers[] = new int[1000];
        int fourNumbers[] = new int[1000];
        int test = 0, index = 1, k=0;

        for (int i = (count-1); i >= 0; i--) {
                numbers[i] = num % 10;
                num = num / 10;
        }

        for (int i = (count-1); i >= 0; i--) {
                if (numbers[i] == 0)
                numbers[i] = 9;
        }

        
                // Two Numbers

        for (int i=0;i < count-1 ;i++){
                        twoNumbers[k] = numbers[i] * 10 + numbers[i+1];
                        k++;
        }

        int new_twoNumbers[] = new int[k];
                        
                        for(int i=0; i<k; i++) {
                        new_twoNumbers[i] = twoNumbers[i];}
      
        //        R      E       V

        int rev_new_twoNumbers[] = new int[k];

                        for(int i=0; i<k; i++) {
                        rev_new_twoNumbers[i] = (new_twoNumbers[i] % 10) * 10 + (new_twoNumbers[i] / 10);
                        }

                for(int i=0; i<k; i++) {
                        for(int j=0; j<k; j++) {
                           if (rev_new_twoNumbers[i] == new_twoNumbers[j] && j-i>1){
                           index = 2;     
                           test = 1;
                           }
                        }

                        }


                        // Three Numbers
                        k=0;


        for (int i=0;i < count-2 ;i++){
                         threeNumbers[k] = numbers[i] * 100 + numbers[i+1] * 10 + numbers[i+2] ;
                        k++;

                              
                
        }

                        int new_threeNumbers[] = new int[k];
                        
                        for(int i=0; i<k; i++) {
                        new_threeNumbers[i] = threeNumbers[i];}

      //        R      E       V

        int rev_new_threeNumbers[] = new int[k];

                        for(int i=0; i<k; i++) {
                        rev_new_threeNumbers[i] = (new_threeNumbers[i] % 10) * 100 + ((new_threeNumbers[i] % 100) / 10) * 10 + (new_threeNumbers[i] / 100);
                        }

                for(int i=0; i<k; i++) {
                        for(int j=0; j<k; j++) {
                           if (rev_new_threeNumbers[i] == new_threeNumbers[j] && j-i>2){
                           index = 3;     
                           test = 1;
                           }
                        }

                        }

                                // Four Numbers
                        k=0;


        for (int i=0;i < count-3 ;i++){
                         fourNumbers[k] = numbers[i] * 1000 + numbers[i+1] * 100 + numbers[i+2]*10 + numbers[i+3];
                        k++;

                              
                
        }

                        int new_fourNumbers[] = new int[k];
                        
                        for(int i=0; i<k; i++) {
                        new_fourNumbers[i] = fourNumbers[i];}

      //        R      E       V

        int rev_new_fourNumbers[] = new int[k];

                        for(int i=0; i<k; i++) {
                        rev_new_fourNumbers[i] = (new_fourNumbers[i] % 10) * 1000 + ((new_fourNumbers[i] % 100) / 10) * 100 + ((new_fourNumbers[i] % 1000) / 100) * 10 + ((new_fourNumbers[i] % 10000) / 1000);
                        }

                for(int i=0; i<k; i++) {
                        for(int j=0; j<k; j++) {
                           if (rev_new_fourNumbers[i] == new_fourNumbers[j] && j-i>3){
                           index = 4;     
                           test = 1;
                           }
                        }

                        }

              
                if (test == 1)
                 System.out.print("Yes" + " " + index);
                 else
                 System.out.print("No");

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