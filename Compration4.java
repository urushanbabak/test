package ir.ac.kntu

import java.util.Scanner

public class Compriation4 {

    public static void main (String[] args){
	Scanner inScan = new Scanner(System.in);
            int arrlen = inScan.nextInt();
			int numbers[] = new int [arrlen];
			int max = Integer.MIN_VALUE;
		    int maxIndex = 0;
		 
		 for ( int i=0;i<arrlen;i++ ) {
			 System.out.println( "Enter a number" );
			 numbers[i] = inScan.nextInt();
		 }
			 
	inScan.close();
			
		 for ( int i=0;i<arrlen;i++ ) {
			 if ( numbers[i] > max )
				 max = numbers;
				 maxIndex ++;
        }
		
		System.out.println( "The max Numbers is in index" + (maxIndex+1) 
						    "wich is" + numbers[maxIndex] );

}