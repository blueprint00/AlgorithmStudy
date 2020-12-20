package Greedy;
import java.util.*;

public class MakeBigNum {
	public static void main(String[] args) {
		String number = "1231234";
		int k = 3;
		
		System.out.println(solution(number, k));
	}
	
	public static String solution(String number, int k) {
        /*String answer = "";
        
        char[] num = number.toCharArray();
        Stack<Character> tmp = new Stack<>();
        for(int i = 0; i < num.length; i ++) {
        	while(!tmp.empty() && k > 0 && tmp.peek() < num[i]) {
        		k --;
        		tmp.pop();
        	}
        	tmp.push(num[i]);
        }
        
        
        //왜 안될까.....
//        while(!tmp.empty()) {
//        	if(k != 0) {
//        		tmp.pop();
//        		k --;
//        	} else {
//        		answer.concat(String.valueOf(tmp.pop()));
//        	}
//        }
//         return answer;
      
        StringBuilder sb = new StringBuilder();
//		 k개를 삭제하지 못 한 경우 뒤에서 부터 제거. 
		while(!tmp.empty()) {
			if(k != 0) {
				tmp.pop();
				k--;
			}else {
				sb.append(tmp.pop());
			}
		}	
		return sb.reverse().toString();*/
        
        
        char[] answer = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < number.length(); i ++) {
        	char c = number.charAt(i);
        	while(!stack.isEmpty() && stack.peek() < c && k -- > 0) {
        		stack.pop();
        	}
        	stack.push(c);
        }

        for(int i = 0; i < answer.length; i ++) {
        	answer[i] = stack.get(i);
        }
        return new String(answer);
    }
}
