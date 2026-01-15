package STRINGS;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        String concat = s + s;


        if(concat.contains(goal) && s.length() > 0 && s.length() == goal.length()){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
