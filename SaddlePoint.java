package ir.ac.kntu; 
import java.util.Arrays;

public class SaddlePoint{
    public static int[] findSaddlePoint(int[][] matrix){
    int leny = matrix.length;
    int lenx = matrix[0].length;
    int [] array = new int [leny*lenx];
    int k =0,temp=0,p=0,t=0,s=0,pi=0,pj=0;
    int [] point = new int [2];   
    for (int i =0; i < leny; i++){
        for(int j=0; j < lenx; j++){
            array[k] = matrix[i][j];
            k++;
        }
    }
    // Bozorg Tarin DAR SOTOON;
    for (int j=0;j<lenx;j++){
        p=0;
       for (int i=j; i<k; i=i+lenx){
            if (temp<array[i]){
                point[0] = p;
                point[1] = j;


            }
            temp = array[i];
            p++;
    }
    // Kochektarin Tarin DAR Radif;
        for (int i=0;i<lenx;i++){
           if (array[(point[0]*lenx)+i] > array[(point[0]*lenx)]+point[1]){
               t++;
           }
        }

        if (t==(lenx-1))
        {
            s=1;
            pi=point[0];
            pj=point[1];
        }
    
    } 
        return s>0 ? (pi+","+pj) : null;

    }

}   