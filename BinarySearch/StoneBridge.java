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
        		// 정확히 n개가 아니여도 되는 이유는 미처 지우지 못한 바위의 개수만큼 더 지워도 바위 간 간격의 최솟값이 기준값인 x보다 작을 수는 없으므로 상관없기 때문입니다.
        		// if remove == 2 && mid == 3
        		// 거리는 4, 2, 7, 7, 7, 7
        		// 4를 지우면 7 중 어느걸 지워도 min == 2 이다.
        		// 즉 remove == 1 이어도 min 간격과는 상관 없다!
        		// 뭔 말 인지 알겠니..?
        		answer = mid > answer? mid : answer;
        		first = mid + 1;
        	} else {
        		last = mid - 1;
        	}
        }
        
        return answer;
	}
}
