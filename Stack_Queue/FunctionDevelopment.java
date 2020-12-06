package Stack_Queue;
import java.util.*;

public class FunctionDevelopment {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		int[] answer = solution(progresses, speeds);
		
		for(int ans : answer) System.out.println(ans); // 2, 1
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> work = new LinkedList<>();
        
        int prevWork = 0;
        int curWork = 0;
        int numOfWork = 1;
        
        for(int i = 0; i < progresses.length; i ++) {
        	work.offer((100 - progresses[i]) / speeds[i] + 1); 
        }
        
    	prevWork = work.poll();
    	
        while(!work.isEmpty()) {
        	curWork = work.poll();
        	
        	if(prevWork >= curWork) {
        		numOfWork ++;
        	} else {
        		list.add(numOfWork);
        		numOfWork = 1;
        		prevWork = curWork;
        	}
        }
        list.add(numOfWork);
        
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size(); i ++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
