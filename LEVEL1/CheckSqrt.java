package LEVEL1;

public class CheckSqrt {
	public static void main(String[] args) {
		long n = 121;
		System.out.println(solution(n));
	}
	public static long solution(long n) {
        long l = (long) Math.sqrt(n);
        return n == Math.pow(l, 2) ? (long) Math.pow(l + 1, 2) : -1;
    }
}
