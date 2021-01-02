package DynamicProgramming;

public class Thief {
	public static void main(String[] args) {
		int[] money = {1, 2, 3, 3, 1};
		System.out.println(solution(money));
	}
	
	public static int solution(int[] money) {
        int answer = 0;
        int len = money.length;
        int[] dp1 = new int[len], dp2 = new int[len];
        
        dp1[0] = dp1[1] = money[0]; // 첫 번째 집을 턴 경우 2번째 집 x -> 첫번째 집에서 턴 돈으로 초기화
        dp2[0] = 0; dp2[1] = money[1]; // 두 번째 집부터 털기
        
        for(int i = 2; i < len; i ++) {
        	dp1[i] = Math.max(dp1[i - 2] + money[i], dp1[i - 1]);
        	dp2[i] = Math.max(dp2[i - 2] + money[i], dp2[i - 1]);
        }
        
        return Math.max(dp1[len - 2], dp2[len - 1]); //dp1은 첫번째 집이 포함되 있으므로 마지막 집은 못 텀 == len - 2
        
       
//        boolean[] flag = new boolean[len];
//    	int cnt = 0;
//        while(cnt < len) {
//        	int max = 0, max_idx = 0;
//            for(int i = 0; i < len; i ++) {
//            	if(max < money[i] && !flag[i]) {
//            		max = money[i];
//            		max_idx = i;
//            	}
//            }
//            
//            answer += max;
//            flag[max_idx] = true;
//            cnt ++;
//            
//            if(cnt == len) break;
//            
//            if(max_idx == 0) flag[len - 1] = true;
//            else flag[max_idx - 1] = true;
//            
//            if(max_idx == len - 1) flag[0] = true;
//            else flag[max_idx + 1] = true;
//            
//            cnt += 2;
//            
//            for(boolean f : flag) {
//            	System.out.print(f + " ");
//            }System.out.println();
//        }
//        return answer;
    }
}
