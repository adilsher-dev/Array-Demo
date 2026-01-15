package STRINGS;

public class ReverseWords {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        String s1 = " hello world ";
        String s = s1.trim();
        int n = s.length();

        for(int i = n - 1 ; i >= 0;i--){
            char ch = s.charAt(i);
            if( ch != ' '){
                word.append(ch);
            }
            else {
                if(word.length() > 0){
                    result.append(word.reverse().append(" "));
                    word.setLength(0);//this is reducing the word string to be empty
                }
            }
        }


        //add last word bcz never comes a space in last

        if(word.length() > 0){
            result.append(word.reverse());
        }

        System.out.println("The modified string s:"+result.toString());

    }
}