package STRINGS;
import java.util.*;

public class Isomorphic {
    public static void main(String[] args) {
        HashMap<Character,Character> mpp1 = new HashMap<>();
        HashMap<Character,Character> mpp2 = new HashMap<>();

        String s = "egg";
        String t = "dbb";

        for(int i = 0; i < s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mpp1.containsKey(c1)){
                if(mpp1.get(c1) != c2){
                    System.out.println(false);
                }
                mpp1.put(c1,c2);
            }

            if(mpp2.containsKey(c2)){
                if(mpp1.get(c2) != c1){
                    System.out.println(false);
                }
                mpp1.put(c1,c2);
            }
        }
        System.out.println(true);
    }
}
