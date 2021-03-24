package Heap;
import java.util.*;

public class DoublePriorityQueue {
	public static void main(String[] args) {
		String[] operations = {"I 16", "D 1"};
		for(int ans : solution(operations)) {
			System.out.println(ans);
		}
	}
	
    // static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    // static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public static int[] solution(String[] operations) {
        int[] answer = new int[2];

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
                
        for(int i = 0; i < operations.length; i ++){
            String op = operations[i].split(" ")[0];            
            int code = Integer.parseInt(operations[i].split(" ")[1]);
            
            switch(op){
            	case "I" : 
            		// insert(code);
					maxHeap.offer(code);
					minHeap.offer(code);
            		break;
            	case "D" : 
            		if(code == 1) {
            			// deleteMax();
						minHeap.remove(maxHeap.poll());
            		} else if(code == -1) {
            			// deleteMin();
						maxHeap.remove(minHeap.poll());
            		}
            		break;
            }
        }
        
        if(!maxHeap.isEmpty()) {
        	answer[0] = maxHeap.poll();
        	answer[1] = minHeap.poll();
        } else {
        	answer[0] = answer[1] = 0;
        }
        
        return answer;
    }
	
	// public static void insert(int num) {
	// 	maxHeap.offer(num);
	// 	minHeap.offer(num);
	// }
	// public static void deleteMax() {
	// 	minHeap.remove(maxHeap.poll());
	// }
	// public static void deleteMin() {
	// 	maxHeap.remove(minHeap.poll());
	// }
}
