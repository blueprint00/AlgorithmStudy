package LEVEL1;

public class CaesarPassword {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		System.out.println(solution(s, n));
	}
	public static String solution(String s, int n) {		
		char[] ch = s.toCharArray();
		for(int i = 0; i < s.length(); i ++) {
			if((ch[i] < 'a' || ch[i] > 'z') && (ch[i] < 'A' || ch[i] > 'Z')) continue;
			int cnt = n;
			while(cnt > 0) {
				if(ch[i] == 'Z') {
					ch[i] = 'A';
					cnt --;
					continue;
				}
				else if(ch[i] == 'z') {
					ch[i] = 'a';
					cnt --;
					continue;
				}
				else ch[i] ++;
				cnt --;
			}
		}
		return new String(ch);
	}
}
