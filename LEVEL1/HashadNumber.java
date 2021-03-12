package LEVEL1;

public class HashadNumber {
	public static void main(String[] args) {
		int x = 13;
		System.out.println(solution(x));
	}
	public static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int tmp = x;
        while(tmp > 0){
            sum += tmp % 10;
            tmp = tmp / 10;
        }
        return x % sum == 0 ? true : false;
    }
}
