package LEVEL2;
import java.util.*;
public class CorrectParentheses {
    public static void main(String[] args){
        String s = "(()())";
        System.out.println(solution(s));
    }
    public static boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(') st.push(ch);
            else {
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}