package LEVEL1;

public class String2Integer {
	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}
	public static int solution(String s) {
		int answer = 0;
		
//		if(s.charAt(0) == '-') answer = 0 - Integer.parseInt(s.substring(1));
//		else if(s.charAt(0) == '+') answer = Integer.parseInt(s.substring(1));
// 		else answer = Integer.parseInt(s);
		
		boolean sign = true;
		int result = 0;
	
		for(int i = 0; i < s.length(); i ++) {
			char ch = s.charAt(i);
			if(ch == '-') sign = false;
			else if(ch != '+') {
				result = result * 10 + (ch - '0');
			}
		}
		
		return (sign ? 1 : -1) * result;
	}
}
