package Greedy;
import java.util.*;

public class ConnectIsland {
	public static void main(String[] args) {
		int n = 4;
		int[][] costs = {{0, 1, 1}, 
						 {0, 2, 2},
						 {1, 2, 5}, 
						 {1, 3, 1}, 
						 {2, 3, 8}};
		
		System.out.println(solution(n, costs));
	}
	
	static int[] parent;
	public static int find(int n) { // 최상위 부모 찾기
		if(parent[n] == n) return n; 
		return parent[n] = find(parent[n]);
	}
	
	public static void union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		if(aRoot != bRoot) parent[a] = b;
	}
	
	public static int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        
        Arrays.sort(costs, (o1, o2) -> (o1[2] - o2[2]));
       
        int[] root = new int[n];
        for(int i = 0; i < n; i ++) root[i] = i; // 초기 부모는 자기 자신
        
        for(int i = 0; i < costs.length; i ++) { // 모든 간선에 대해서
        	int start = costs[i][0];
        	int end = costs[i][1];
        	
        	if(find(start) == find(end)) continue; // 최상위 부모가 같으면 == 사이클 형성
        
        	union(start, end); // 최상위 부모 설정
        	answer += costs[i][2];
        	
        }
        return answer;
    }
}
// kruskal :: https://blog.naver.com/ssarang8649/221038259400
