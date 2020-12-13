package DFS_BFS;
import java.util.*;

public class Network {
	public static void main(String[] args) {
//		int n = 4;
//		int[][] computers = {{1, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 1, 1}, {0, 0, 1, 1}};
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 1, 1}};
		System.out.println(solution(n, computers));
	}
	
//	static int cnt = 0;
	public static int dfs(int i, int[][] computers, boolean[] visited) {
		
		if(visited[i]) return 0;
		visited[i] = true;
		
		for(int j = 0; j < computers[i].length; j ++) {
			if(computers[i][j] == 1) //System.out.println((cnt ++) + " (" + i + ", " + j + ", " + dfs(j, computers, visited) + ")");
				dfs(j, computers, visited);
			
		}
		return 1;
	}
	
	public static int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[] visited = new boolean[n];
		
		for(int i = 0; i < n; i ++) {
			System.out.println(i);

			if(!visited[i])
				answer += dfs(i, computers, visited);
		}
		
		return answer;
	}
}
