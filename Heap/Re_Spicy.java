package Heap;
import java.util.*;

public class Re_Spicy {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		
		System.out.println(solution(scoville, K));
	}
	
    public static int solution(int[] scoville, int K) {
    	int answer = 0;
    	
    	PriorityQueue<Integer> heap = new PriorityQueue<>(); 
    	for(int sco : scoville) heap.offer(sco);
    	
    	while(heap.peek() <= K) {
    		if(heap.size() == 1) return -1;
    		
    		int result = (heap.poll() + (heap.poll() * 2));
    		heap.offer(result);
    		answer ++;
    	}
    	
    	return answer;
    }
}