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
	
	public static int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        
        Arrays.sort(costs, (o1, o2) -> (o1[2] - o2[2]));
       
        for(int i = 0; i < n; i ++) parent[i] = i; // 초기 부모는 자기 자신
        
        for(int i = 0; i < costs.length; i ++) { // 모든 간선에 대해서
        	int firstIsland = find(costs[i][0]);
            int SecondIsland = find(costs[i][1]);
            if(firstIsland != SecondIsland) {            //부모가 같지 않다면 연결이 안된 최솟값이므로
                parent[SecondIsland] = firstIsland;    //연결
                answer += costs[i][2];                    
            }
        }
        return answer;
    }
}
// kruskal :: https://blog.naver.com/ssarang8649/221038259400
