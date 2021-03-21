package Stack_Queue;
import java.util.*;

public class Printer {
	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		
		System.out.println(solution(priorities, location));
	}
	
    public static int solution(int[] priorities, int location) {
		//210321
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for(int priority : priorities) pq.add(priority);
		//3, 2, 2, 1
		while(!pq.isEmpty()){
			for(int i = 0; i < priorities.length; i ++){
				if(pq.peek() == priorities[i]){
					pq.poll();
					answer ++;
					
					if(location == i){
						pq.clear();
						break;
					}
				}
			}
		}
		return answer;

    	// int answer = 0;
    	// PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //우선순위 높은 대로 저장
    	
    	// for(int priority : priorities) pq.offer(priority);
    	
    	// while(!pq.isEmpty()) {
    	// 	for(int i = 0; i < priorities.length; i ++) {
    	// 		if((int) pq.peek() == priorities[i]) { // 3, 2, 2, 1
    	// 			pq.poll(); // 3, 2, 2, 1
    	// 			answer ++;
    				
    	// 			if(location == i) {
    	// 				pq.clear();
    	// 				break;
    	// 			}
    	// 		}
    	// 	}
    	// }

    	// return answer;
    }
}
