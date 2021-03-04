package LEVEL1;

import java.util.*;

public class StringDESC {
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
	
	public static String solution(String s) {
//        String answer = "";
//        char[] ch = s.toCharArray();
//        
//        Stack<Character> list = new Stack<>();
//
//        for(int i = 0; i < s.length(); i ++){
//            for(int j = 0; j < s.length() - i - 1; j ++){
//                if(ch[i] < ch[i + 1]){
//                    char tmp = ch[i];
//                    ch[i] = ch[i + 1];
//                    ch[i + 1] = tmp;
//                }
//            }
//        }
//
//        for(char c : ch) {
//            if(c >= 'A' && c <= 'Z')
//            	list.add(c);
//        }
        
        String answer = "";
        String[] str = s.split("");
        
        Arrays.sort(str, Collections.reverseOrder());
        for(String ans : str)
            answer += ans;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int ans : list) {
        	
        }

        
        return answer;
    }
}
