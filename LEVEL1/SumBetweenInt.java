package LEVEL1;

public class SumBetweenInt {
	public static void main(String[] args) {
		int a = 5, b= 3;
		System.out.println(solution(a, b));
	}
	public static long solution(int a, int b) {
        long answer = 0;
        
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        if(a == b) answer = a;
        else answer += ((min + max) * (max - min + 1)) / 2;
        
//        int min = Math.min(a, b);
//        int max = Math.max(a, b);
//
//        for(int i = min; i <= max; i ++) {
//        	answer += i;
//        }
        
//        for(int i = Math.min(a, b); i <= Math.max(a, b); i ++) {
//        	answer += i;
//        }
        return answer;
    }
}
