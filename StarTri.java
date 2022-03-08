

import java.util.Scanner;

public class StarTri {
	
	
	public static void main(String[] args) {
		
		Scanner heightscanner = new Scanner (System.in);
		int height = heightscanner.nextInt();
		draw (height);
		
	}
	
	
	public static void draw (int height) {
		
		for (int i = 1; i <= height; i++) {
			
			 for (int k = (height-i); k>0; k--){
				System.out.print(" ");
				}
				
				for (int j =1; j <= (2*i)-1; j++){
				System.out.print("*");
					}
			
					System.out.print("\n");		
						}
		
		
	}
	
	
}