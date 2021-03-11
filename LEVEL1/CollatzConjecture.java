package LEVEL1;

public class CollatzConjecture {
	public static void main(String[] args) {
		int n = 626331;
		System.out.println(solution(n));
	}
	public static int solution(int num) {
		int answer = 0;
		double n = (double) num; // double로 안 하면 오버플로우 나옴............
		while(true) {
			if(n == 1) break;
			if(answer == 500) return -1;
			
			if(n % 2 == 0) n /= 2;
			else n = n * 3 + 1;
			answer ++;
		}
		
		return answer;
	}
}
