package Stack_Queue;

public class StockPrice {
	public static void main(String[] args) {
		
		int[] prices = {1, 2, 3, 2, 3};
		int[] answers = solution(prices);
		for(int answer : answers) System.out.println(answer);
		
	}
	public static int[] solution(int[] prices) {
        //210321
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i ++){
            int cnt = 0;
            for(int j = i + 1; j < prices.length; j ++){
                cnt ++;
                if(prices[i] > prices[j]) break;
            }
            answer[i] = cnt;
        }
        return answer;
        
        // int[] answer = new int[prices.length];
        
        // for(int i = 0; i < prices.length; i ++){
        //     int cnt = 0;
        //     for(int j = i + 1; j < prices.length; j ++){
        //         cnt ++;
        //         if(prices[i] > prices[j]) break;
        //     }
        //     answer[i] = cnt;
        // }        
        
        // return answer;
    }
}
