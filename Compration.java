package ir.ac.kntu

import java.util.Scanner

public class Compriation {

    public static void main (String[] args){
   Scanner inScan = new Scanner(System.in);
			int first = 0, secend= 0;
		 System.out.print("Enter The First Number:");
			first = inScan.nextInt();
         System.out.print("Enter The Seconde Number:");
			secend = inScan.nextInt();
	inScan.close();
								
           String endResult= first > second ? "First is greater" :
		                     second > first ? "Second is greater" :
							 "Both numbers are equal";
		   
		 System.out.println("Result is" + endResult);
			
        }

}