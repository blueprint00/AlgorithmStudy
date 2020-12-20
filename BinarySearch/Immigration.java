package BinarySearch;

import java.util.Arrays;

public class Immigration {
	public static void main(String[ ] args) {
		int n = 6;
		int[] times = {7, 10};
		System.out.println(solution(n, times));
	}
	
	public static long solution(int n, int[] times) {
        long answer = 0;
        
        Arrays.sort(times);
        long first = 0;
        long last = (long)times[times.length - 1] * n;
        
        while(first <= last) {
        	long mid = (first + last) / 2;
        	long cnt = 0;
        	
        	for(int i = 0; i < times.length; i ++) {
        		cnt += mid / times[i];
        		System.out.println(cnt);
        	}
        	
        	if(cnt >= n) { //mid == 29 일 때도 똑같이 n == 6 이므로 조건에 맞는 최솟값 기억 
        		if(answer == 0) answer = mid;
        		else answer = Math.min(answer, mid);
        		
        		last = mid - 1;
        	} else first = mid + 1;
        }
        
        return answer;
    }
}
