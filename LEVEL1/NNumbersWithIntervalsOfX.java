package LEVEL1;

public class NNumbersWithIntervalsOfX {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		for(long i : solution(x, n)) {
			System.out.println(i);
		}
	}
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i ++){
            answer[i] = (long) (i + 1) * x;
        }
        return answer;
    }
}
