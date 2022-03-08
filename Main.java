package ir.ac.kntu;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] name = new String[n];
		int[] monny = new int[n];
		
		for(int i =0;i<n;i++){
		     
		     name[i]=input.next();
		     monny[i]=0;
		}
		for(int i =0;i<n;i++){
		    
		     
		     String temp=input.next();
		     
		     int p = input.nextInt();
             int t = input.nextInt();
		     monny[check(name,temp,n)]-=p;
             monny[check(name,temp,n)]+=(p%t);
		     for(int j =0;j<t;j++){
		        
		        temp=input.next();
		        int x=check(name,temp,n);
		        monny[x]+=p/t;
		     }
		}
		for(int i =0;i<n;i++){
		     System.out.println(name[i]+" "+monny[i]);
		}
		
	}
	public static int check(String[] name,String s, int n){
	     for(int i =0;i<n;i++){
	         if (name [i].equals(s)){
	             return i;
	         }
		}
	     
	     return 0;
	}
}