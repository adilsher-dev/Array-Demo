package STRINGS;

public class LargestOdd {
    public static void main(String[] args) {
        String s = "35427";
        int n = s.length();
        int index  = -1;

        for(int i = n-1 ; i >= 0;i--){
            char ch = s.charAt(i);
            int number = ch - '0';
            if( number % 2 == 1 ){
                index = i;
                break;
            }
        }
        String org = s.substring(0,index+1);
        System.out.println("The Largest odd number str is:"+org);
    }
}
