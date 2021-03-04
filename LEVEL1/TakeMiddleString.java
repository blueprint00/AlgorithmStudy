package LEVEL1;

public class TakeMiddleString {
	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
        int length = s.length();
        int mid = (int) s.length() / 2;
        
        if(length % 2 == 0){
            answer += s.substring(mid - 1, mid + 1);
        } else {
            answer += s.substring(mid, mid + 1);
        }
        
        return answer;
        
//		return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
	}
}
