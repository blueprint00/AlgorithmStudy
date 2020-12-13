package DFS_BFS;
import java.util.*;

public class TargetNumber {
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 2};
		int target = 2;
		
		System.out.println(solution(numbers, target));
	}
	
	////////// dfs
	public static int dfs(int prev, int index, int[] numbers, int target) {
		int answer = 0;
		
		if(index >= numbers.length) {
			if(prev == target) return 1;
			return 0;
		}
		
		int sum1 = prev + numbers[index];
		int sum2 = prev - numbers[index];
		
		answer += dfs(sum1, index + 1, numbers, target);
		answer += dfs(sum2, index + 1, numbers, target);
		
		return answer;
		// return dfs(prev + numbers[index], index + 1, numbers, target) + dfs(prev - numbers[index], index + 1, numbers, target);
	}
	public static int solution(int[] numbers, int target) {
        int answer = 0;
        
        answer += dfs(numbers[0], 1, numbers, target);
        answer += dfs(-numbers[0], 1, numbers, target);
        
        return answer;
	}
	
	//////////bfs
//	public static class Pair{
//		int num;
//		int index;
//		
//		public Pair(int num, int index) {
//			this.num = num;
//			this.index = index;
//		}
//	}
//	
//	public static int solution(int[] numbers, int target) {
//		int answer = 0;
//		 
//		Queue<Pair> queue = new LinkedList<Pair>();
//		
//		queue.offer(new Pair(numbers[0], 0));
//		queue.offer(new Pair(-numbers[0], 0));
//		 
//		while(!queue.isEmpty()) {
//			Pair p = queue.poll();
//			
//			if(p.index == numbers.length - 1) {
//				if(target == p.num) answer ++;
//				continue;
//			}
//			
//			int sum1 = p.num + numbers[p.index + 1];
//			int sum2 = p.num - numbers[p.index + 1];
//			
//			queue.offer(new Pair(sum1, p.index + 1));
//			queue.offer(new Pair(sum2, p.index + 1));
//		}
//		 
//		return answer;
//	}
}
