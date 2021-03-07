package LEVEL1;

public class DigitsPlus {
	public static void main(String[] args) {
		int N = 123;
		System.out.println(solution(N));
	}
	
	public static int solution(int N) {
		int sum = 0;
		while(N > 0) {
			sum += N % 10;
			N = N / 10;
		}
		return sum;
	}
}
