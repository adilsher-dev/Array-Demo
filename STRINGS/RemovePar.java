package STRINGS;
public class RemovePar {
    public static void main(String[] args) {
        //most optimal solution of this question and done by me without even seeing the soln i am very happy right now
        StringBuilder result = new StringBuilder();
        String s = "(()())(())(()(()))";
        int n = s.length();
        int count = 0;

        for(int i = 0 ; i < n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(count != 0){
                result.append(s.charAt(i));
                }
                count++;
            }
            else{
                count--;
                if(count != 0){
                    result.append(s.charAt(i));
                }
            }
        }
        String ans = result.toString();
        System.out.println("The modified String is:"+ans);
    }
}
