package DynamicProgramming;

public class IntTriangle {
	public static void main(String[] args) {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.println(solution(triangle));
	}
	
	public static int solution(int[][] triangle) {
        int answer = 0;
        
        int len = triangle.length;
    	int[][] sum = new int[len][len];
        
        sum[0][0] = triangle[0][0];
        for(int i = 1; i < len; i ++) {
        	sum[i][0] = sum[i - 1][0] + triangle[i][0];
        	sum[i][i] = sum[i - 1][i - 1] + triangle[i][i];

        }
        
        for(int i = 2; i < len; i ++) {
        	for(int j = 1; j < triangle[i].length; j ++) {
        		sum[i][j] = Math.max(sum[i - 1][j - 1], sum[i - 1][j]) + triangle[i][j];
        	}
        }
        
        for(int ans : sum[len - 1]) {
        	System.out.println(ans);
        	answer = Math.max(answer, ans);
        }
        
        return answer;
    }
} // 1점 나옴ㅎㅎㅎ
