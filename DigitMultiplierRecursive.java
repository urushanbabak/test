package ir.ac.kntu;

import java.lang.Math;
import java.util.Scanner;

public class DigitMultiplierRecursive {


    public static long calculateResultRecursive(long number) {
        long pow = 1;
        number = Math.abs(number);
        while (pow < number) {
            pow = pow * 10;
        }
        if (pow == 10) {
            return number;
        }
        ;
        return number < 10 ? number * (-1) : number * calculateResultRecursive(number % (pow / 10)) * (-1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long outPut = calculateResultRecursive(number);
        System.out.println(outPut);
    }
}