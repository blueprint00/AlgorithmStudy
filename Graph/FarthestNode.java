package Graph;
import java.util.*;

public class FarthestNode {
	public static void main(String[] args) {
		int n = 6;
		int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
		System.out.println(solution(n, edge));
	}
	
	public static int solution(int n, int[][] edge) {
		int answer = 0;
		List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < edge.length; i ++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int[] e : edge) {
			graph.get(e[0] - 1).add(e[1] - 1);
			graph.get(e[1] - 1).add(e[0] - 1);
		}
		
		boolean[] visited = new boolean[n];
		int[] depth = new int[n];
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		visited[0] = true;
		while(!q.isEmpty()) {
		  	int i = q.poll();
		  	for(int j : graph.get(i)) {
		  		if(!visited[j]) {
		  			depth[j] = depth[i] + 1;
		  			visited[j] = true;
		  			q.add(j);
		  		}
		  	}
		}
		
		int max = 0;
		for(int dep : depth) {
			max = Math.max(max, dep);
		}
		for(int dep : depth) {
			if(max == dep) answer ++;
		}

		return answer;
	}
	
	//안된다....
//	public static int solution(int n, int[][] edge) {
//        int answer = 0;
//    	int[][] graph = new int[n][n];
//        for(int[] e : edge) {
//        	graph[e[0] - 1][e[1] - 1] = 1;
//        	graph[e[1] - 1][e[0] - 1] = 1;
//        }
//    	
//        boolean[] visited = new boolean[n];
//        int[] depth = new int[n];
//
//        Queue<Integer> q = new LinkedList<>();
//        q.add(0);
//        visited[0] = true;
//        while(!q.isEmpty()) {
//        	int i = q.poll();
//        	for(int j : graph[i]) {
//        		if(!visited[j]) {
//        			depth[j] = depth[i] + 1;
//        			q.add(j);        	
//        			visited[j] = true;
//        		}
//        	}
//        }
//        
//        int max = 0;
//        for(int dep : depth) {
//            max = Math.max(max, dep);
//        }
//        for(int dep : depth) {
//        	if(max == dep) answer ++;
//        }
//        
//        return answer;
//    }
}
