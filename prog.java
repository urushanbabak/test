package ir.ac.kntu;

import java.util.Scanner;
import java.util.Arrays; 
import java.lang.Math;

public class prog {

        public static void main (String[] args){
            int [] Numbers = new int [32];
            int [] Num = {1,3,5,3,2};
            int [] Nu = new int [43];
            int a = Numbers.length;
        

                // With Loops:   
            for (int i=0;i<Numbers.length;i++){
                System.out.println(Numbers[i]);
                }

                // With Loops:
            for (int a : Numbers){
                        System.out.println(a);
             }
    
                // With until.Array:
                System.out.println(Arryas.toString(Numbers));
    
                // Arrays sorting:
                Arrays.sort(Numbers);
                System.out.println(Arrays.toString(Numbers));

                
                
                // Arrays copyOf:
                int [] new_Numbers = Arrays.copyOf(Numbres,6);
                Arrays.sort(new_Numbers);
                System.out.println(Arrays.toString(new_Numbers));
                
                // Reverse:
                int [] rev_Numbers = reverse(Numbers);
                                        
                // 2D Arrays:
                int [][] 2d_Numbers = new int [][];
                System.out.println(Arrays.deepToString(2d_Numbers));
                
                // String:   
                String s = "Hello World";
                String st = new String ("Hello World");
                str = new String("Hello World");
                int length = s.length();
                char s.charAt(3);
                String srti = s.concat(str);
                
                // equals:
                boolean a= s.equals(st);      // True
                boolean b = (s==st);          // False
                
                // To Char Array:
                char [] araay = str.toCharArray();   // result:  ['H','l','l','o','W','o','r','l','d'];
                
                //Sub String:
                String arr = str.substring(6);  // arr would bee "World";

                // Split:
                String [] arr = str.split(""); // arr would be ["Hello","World"];

                // Trim:
                String exam = " Hello World! " ;
                String new_exam = exam.trim();   // new_exam would be "Hello Wolrd!"

                // Replace:
                String mesal = str.replace ('l','i');   // mesal would be "Heiio Worid";
                
                //join:
                String s = String.join("-","This" ,"is" ,"a","string" ); //s would be "This-is-a-string"   // "-" is delimiter

                // Format:
                String si = "just a string"; 
                String first = "first massage";
                String second = "second massage";
                String s1 = String.format("My string is %s." , si );
                String s2 = String.format("My string is %.6f." , 9.98); 
                String s3 = String.format("My string is: %2$s, %1$s and %2$s.", first, second);
                // s1 would be "My string is just a string."
                // s2 would be "My string is 9.980000."
                // s3 would be "My string is: second massage, first massage and second massage."
                

                // intern:
                String st1 = "Hello";
                String st2 = new String("Hello").intern();  // st1 == st2 returns true.





        } 

}