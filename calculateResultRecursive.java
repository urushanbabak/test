package ir.ac.kntu;

public class DigitMultiplierRecursive{
    public static long calculateResultRecursive(int number) {    
            int pow = 1;
            while(pow<number){
                pow = pow * 10;
            }
            return number<10 ? 1 : number * calculateResultRecursive(number%(pow-1));

    }
    public static void main(String[] args) { 
       System.out.println(calculateResultRecursive(4661));
    }
}