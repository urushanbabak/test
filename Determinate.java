package ir.ac.kntu;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Determinate{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int [] Numbers = new int [25];
        int k = 0;
        while (scanner.hasNext()){
        Numbers[count] = scanner.nextInt();
        count++;
        } 
        scanner.close();  
        int [] newNumbers = Arrays.copyOf(Numbers,count);
        count = newNumbers.length;
        int [][] matrix = new int [count][count];
        for(int i=0; i < Math.sqrt(count); i++){
            for(int j=0; j < Math.sqrt(count); j++){
                matrix [i][j] = newNumbers [k];
                k++;
            }
        }

        System.out.println(findDeterminate(matrix, Math.sqrt(count)));                                                                
    }

    public static int findDeterminate(int[][] matrix, double count) {
        int result = 0;
        double len = count;
        // Matrix 2 * 2:
        if (len == 2) {
        result = (matrix [0][0]*matrix [1][1]) - (matrix [0][1]*matrix [1][0]) ;
        }
        // Matrix 3 * 3:
        if (len == 3) {
        int [][] matrix2_1 = new int [2][2];
        int [][] matrix2_2 = new int [2][2];
        int [][] matrix2_3 = new int [2][2];
        matrix2_1[0][0] = matrix[1][1];
        matrix2_1[0][1] = matrix[1][2];
        matrix2_1[1][0] = matrix[2][1];
        matrix2_1[1][1] = matrix[2][2];    
        matrix2_2[0][0] = matrix[1][0];
        matrix2_2[0][1] = matrix[1][2];
        matrix2_2[1][0] = matrix[2][0];
        matrix2_2[1][1] = matrix[2][2];
        matrix2_3[0][0] = matrix[1][0];
        matrix2_3[0][1] = matrix[1][1];
        matrix2_3[1][0] = matrix[2][0];
        matrix2_3[1][1] = matrix[2][1];
        result = (matrix[0][0]*findDeterminate(matrix2_1,2) - 
        matrix[0][1]*findDeterminate(matrix2_2,2) +
        matrix[0][2]*findDeterminate(matrix2_3,2));
        }
        // Matrix 4 * 4:
        if (len == 4){
        int [][] matrix3_1 = new int [3][3];
        int [][] matrix3_2 = new int [3][3];
        int [][] matrix3_3 = new int [3][3];
        int [][] matrix3_4 = new int [3][3];
        matrix3_1[0][0] = matrix[1][1];
        matrix3_1[0][1] = matrix[1][2];
        matrix3_1[0][2] = matrix[1][3];
        matrix3_1[1][0] = matrix[2][1];
        matrix3_1[1][1] = matrix[2][2];
        matrix3_1[1][2] = matrix[2][3];
        matrix3_1[2][0] = matrix[3][1];
        matrix3_1[2][1] = matrix[3][2];
        matrix3_1[2][2] = matrix[3][3];    
        matrix3_2[0][0] = matrix[1][0];
        matrix3_2[0][1] = matrix[1][2];
        matrix3_2[0][2] = matrix[1][3];
        matrix3_2[1][0] = matrix[2][0];
        matrix3_2[1][1] = matrix[2][2];
        matrix3_2[1][2] = matrix[2][3];
        matrix3_2[2][0] = matrix[3][0];
        matrix3_2[2][1] = matrix[3][2];
        matrix3_2[2][2] = matrix[3][2];
        matrix3_3[0][0] = matrix[1][0];
        matrix3_3[0][1] = matrix[1][1];
        matrix3_3[0][2] = matrix[1][3];
        matrix3_3[1][0] = matrix[2][0];
        matrix3_3[1][1] = matrix[2][1];
        matrix3_3[1][2] = matrix[2][3];
        matrix3_3[2][0] = matrix[3][0];
        matrix3_3[2][1] = matrix[3][1];
        matrix3_3[2][2] = matrix[3][3];
        matrix3_4[0][0] = matrix[1][0];
        matrix3_4[0][1] = matrix[1][1];
        matrix3_4[0][2] = matrix[1][2];
        matrix3_4[1][0] = matrix[2][0];
        matrix3_4[1][1] = matrix[2][1];
        matrix3_4[1][2] = matrix[2][2];
        matrix3_4[2][0] = matrix[3][0];
        matrix3_4[2][1] = matrix[3][1];
        matrix3_4[2][2] = matrix[3][2];
        result = (matrix[0][0]*findDeterminate(matrix3_1,3) - 
        matrix[0][1]*findDeterminate(matrix3_2,3) +
        matrix[0][2]*findDeterminate(matrix3_3,3) -
        matrix[0][3]*findDeterminate(matrix3_4,3));
        }
        return result;
        }
}