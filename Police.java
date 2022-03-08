package ir.ac.kntu;
import java.util.Arrays;

public class Police {
public static String [] findPlate (String args) {
String input = args;
String output="";
String [] result = new String [4];
int k=0;

for (int i=0;i<input.length()-5;i++){ 

output=input.substring(i,i+6);  

if (output.matches("\\d{2}\\D{1}\\d{3}")){
    result[k]=output;
    k++;
}

}
String [] new_result = Arrays.copyOf(result,k);

return new_result;

} 
}
