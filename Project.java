package ir.ac.kntu;

import java.util.Scanner;


public class Project {
	
	
	public static void main (String[] args) {
		Scanner numScan = new Scanner(System.in);
			int firstNum =  numScan.nextInt();
			int secondNum =  numScan.nextInt();
			int sum = firstNum + secondNum;
			int powSum = 0;
			
		numScan.close();
	         
		while(sum > 9) {
			
				powSum = pow(sum);
				secondNum = sum / powSum;
				firstNum = sum / powSum;
				sum = firstNum + secondNum;
			
			
		}
		
		System.out.print(sum);
	}
	
	
	
	public static int pow (int num) {
		int outOfPlace = 0;
        int count = 0;
		int result = 1;
		
		do {
			outOfPlace = num / 10;
			count ++;
		}
		while ( outOfPlace < 9);
		
		for (int i=0;i<count;i++)
			result = result * 10;
		
		return result;
		
		
	}
	
	
}