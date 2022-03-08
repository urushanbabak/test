
import java.util.Scanner;

public class SilverBach {

public static void main (String[] argd) {
    int mainNum, num2, test = 0;
    Scanner scanner = new Scanner(System.in);
    mainNum = scanner.nextInt();
 
        for (int i = 4; i <= mainNum; i++)  {
                    num2 = mainNum - i;

             if(mainNum >= 12 && isPrime(i) == 0 && isPrime(num2) == 0  ) {
                System.out.println(i + " " + num2);
                test = 1;
            }

        }

            if (test==0) {
                System.out.print("Silverbach Conjecture does not work!");
            }
                
        }


public static int isPrime(int num) {
    for (int i = 2; i*i <= num; i++){
        if(num % i == 0)
            return 0;
         }
                return 1;
    } 

}