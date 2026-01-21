package Stack;
import java.util.*;

public class ValidParenthesis {

    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(st.isEmpty()){
                    return false;
                }

                char top = st.pop();

                if((ch == '(' && top != ')' )||( ch == '[' && top != ']' )|| (ch == '{' && top != '}')){
                    return false;
                }
            }
        }
        return st.isEmpty();

    }


    public static void main(String[] args) {
        ValidParenthesis obj = new ValidParenthesis();

        String s1 = "()[]{}";

        boolean result = obj.isValid(s1);

        System.out.println(result);
        
    }
}
