package ir.ac.kntu;

import java.util.Scanner;

public class Determinate{

    public static int findDeterminate(int[][] matrix){
                Scanner scanner = new Scanner(System.in);
                int numbers []= new int [25];
                int count = 0;
                int k=0;


            while(scanner.hasnext()) {
                    numbers[count] = scanner.nextInt();
                count ++;
                }

                int new_numbers [] = new int [count];

                 for (int i=0;i<count;i++) {
    
                      new_numbers [i]= numbers [i];
                 }

                switch (count) {

                case 4:
                    count = count /2;
                break;

                case 3:
                    count = count /3;
                break;

                case 16:
                    count = count /4;
                break;

                case 25:
                    count = count /5;
                break;

                default:
                System.out.print("Error");
                }


                int matrix [][] = new int [count][count];

                for (int i=0;i<count; i++) {

                        for (int j=0;j<count;j++){
                            matrix [i][j] = new_numbers[k];
                            k++;
                        }

                }



    }

    public static int det (int matrix[]) {

    }


}