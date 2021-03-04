package LEVEL1;

public class CountPnY {
	boolean solution(String s) {
        boolean answer = false;
//        int cnt_p = 0, cnt_y = 0;
//        
//        for(int i = 0; i < s.length(); i ++){
//            char ch = s.charAt(i);
//            if(ch == 'P' || ch == 'p') cnt_p ++;
//            else if(ch == 'Y' || ch =='y') cnt_y ++;
//        }
//        if((cnt_p == 0 && cnt_y == 0) || (cnt_p == cnt_y)) answer = true; 
//
//        return answer;
        
        int cnt = 0;
        s.toUpperCase();
        for(int i = 0; i < s.length(); i ++) {
        	char ch = s.charAt(i);
        	if(ch == 'P') cnt ++;
        	if(ch == 'Y') cnt --;
        }
        return (cnt == 0);
    }
}
