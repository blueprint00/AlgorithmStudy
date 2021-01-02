package DynamicProgramming;

import java.util.*;

public class GoToSchool {
	public static void main(String[] args) {
		int m = 4;
		int n = 4;
		int[][] puddles = {{3, 2}, {2, 4}};
		System.out.println(solution(m, n, puddles));
	}
	
	public static int solution(int m, int n, int[][] puddles) {

       Arrays.sort(puddles, new Comparator<int[]>() {
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		if(o1[0] == o2[0]) return o1[1] - o2[1];
        		return o1[0] - o2[0];
			}
        });
        
        int[][] sum = new int[n][m];
        sum[0][0] = 1;
        for(int puddle[] : puddles) {
        	sum[puddle[1] - 1][puddle[0] - 1] = -1;
        }
        
        for(int i = 0; i < n; i ++) {
        	for(int j = 0; j < m; j ++) {   
        		if(sum[i][j] == -1) {
        			sum[i][j] = 0; continue;
        		}
        		
        		if(i != 0) sum[i][j] += sum[i - 1][j] % 1000000007;
        		if(j != 0) sum[i][j] += sum[i][j - 1] % 1000000007;
        	}
        }
        
        for(int i = 0; i < n; i ++) {
        	for(int j = 0; j < m; j ++){
        		System.out.print(sum[i][j] + " ");
        	}System.out.println();
        }
        
        return sum[n - 1][m - 1];
    }
}
