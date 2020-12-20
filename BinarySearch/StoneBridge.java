package BinarySearch;

import java.util.Arrays;

public class StoneBridge {
	public static void main(String[] args) {
		int distance = 25;
		int[] rocks = {2, 14, 11, 21, 17};
		int n = 2;
		System.out.println(solution(distance, rocks, n));
	}
	
	public static int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks);
        
        int first = 0, last = distance;
        
        while(first <= last) {
        	int remove = 0;
        	int prev = 0;
        	int mid = (first + last) / 2;

        	for(int i = 0; i < rocks.length; i ++) {
	        	if(rocks[i] - prev < mid) remove ++; //mid 보다 작은 값 존재 == 돌 제거
	        	else prev = rocks[i];
	        }
        	
        	if(distance - prev < mid) remove ++;
        	
        	if(remove <= n) {
        		answer = mid > answer? mid : answer;
        		first = mid + 1;
        	} else {
        		last = mid - 1;
        	}
        }
        
        return answer;
	}
}
