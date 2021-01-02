package Graph;
import java.util.*;

public class NumberOfRoom {
	public static void main(String[] args) {
		int[] arrows = {6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0};
		System.out.println(solution(arrows));
	}
	
	public static int solution(int[] arrows) {
        int answer = 0;
        
        int[][] xy = {{0, 0}};
        Map<int[], Integer> vertex_visited = new HashMap<>();
        Map<Map<int[], int[]>, Integer> edge_visited = new HashMap<>();

        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        
        int x = 0, y = 0;
        vertex_visited.put(xy[0], 1);
        if(vertex_visited.get(xy) == 1);
        for(int i = 0; i < arrows.length; i ++) {
        	for(int j = 0; j < 2; j ++) { // X의 교차 형태도 세줘야 해서 2배
        		int xpos = x + dx[arrows[i]];
        		int ypos = y + dy[arrows[i]];
        		
        		xy[1][0] = xpos; xy[1][1] = ypos;
        		Map<int[], int[]> m = new HashMap>();
        		m.put(xy[1], xy[1]);
        		if(vertex_visited.get(xy[0]) == 1) {
        			if(edge_visited.get(xy[0], xy[1])) == 0 
        		}
        	}
        }
        
        
        return answer;
    }
}
