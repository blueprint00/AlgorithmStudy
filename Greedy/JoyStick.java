package Greedy;

public class JoyStick {
	public static void main(String[] args) {
		String name = "JEROEN"; // "JAN";
		System.out.println(solution(name));
	}
	
	public static int solution(String name) {
        int answer = 0;
                
        // 알파벳 이동
        for(int i = 0; i < name.length(); i ++) {
        	if(name.charAt(i) != 'A') {
        		int up = name.charAt(i) - 'A';
        		int down = 'Z' - name.charAt(i) + 1;
        		answer += Math.min(up, down);
        	}
        } 
        
        // 커서 이동 
        int minMove = name.length() - 1;
        for(int i = 0; i < name.length(); i ++) {
        	if(name.charAt(i) != 'A') {
        		int next = i + 1;
        		while(next < name.length() && name.charAt(next) == 'A') {
        			next ++;
        		}
        		int move = 2 * i + name.length() - next; //2 * i == 한 번 갔다가 되돌아오기(왼쪽)
        		minMove = Math.min(minMove, move);
        	}
        }
        
        return answer + minMove;
    }
}
