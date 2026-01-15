package STRINGS;
import java.util.*;

public class LongCommon {
    public static void main(String[] args) {
        //logic is this we have to sort the array and store first and last elemnt in the char array and compare until the condition met
        StringBuilder result = new StringBuilder();
        String [] str = {"flower","flow","flight"};
        Arrays.sort(str);


        char [] c1 = str[0].toCharArray();
        char [] c2 = str[str.length-1].toCharArray();

        for(int i = 0; i < c1.length ; i++){
            if(c1[i] != c2[i]){
                break;
            }
            else{
                result.append(c1[i]);
            }
        }
        System.out.println("The longest common prefix is:"+result.toString());
    }
}
