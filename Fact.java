

import java.util.Scanner;

public class Fact {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int num = scanner.nextInt();
		int result = fact(num);
		System.out.print(result);
		     
	}
	
	public static int fact (int num) {
		return num > 0 ? fact(num -1)*num : 1;
	}
	
}
