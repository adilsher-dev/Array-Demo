package STRINGS;
import java.util.*;

public class ValidAnag {
    public static void main(String[] args) {
        String one = "anagram";
        String two = "nagaram";

        char [] c1 = one.toCharArray();
        char [] c2 = two.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(one.length() != two.length()){
            System.out.println("FALSE");
        }
        else {
            if(Arrays.equals(c1,c2)){
                System.out.println("TRUE");
            }
        }
    }
}
