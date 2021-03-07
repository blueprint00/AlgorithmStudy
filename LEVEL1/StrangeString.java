package LEVEL1;

public class StrangeString {
	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String[] tmp = s.split(" ", -1); // -1 넣으면 뭔데????????
		String answer = "";
		for(int i = 0; i < tmp.length; i ++) {
			for(int j = 0; j < tmp[i].length(); j ++) {
				if(j % 2 == 0) answer += Character.toUpperCase(tmp[i].charAt(j));
				else answer += Character.toLowerCase(tmp[i].charAt(j));
			}
			if(i != tmp.length - 1) answer += " ";
		}
		return answer;
	}
}
