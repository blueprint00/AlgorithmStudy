package LEVEL2;

public class Fibonacci {
    public static void main(String[] args){
        int n = 5;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        // if(n == 0 || n == 1) return n;
        int[] fibo = new int[100000];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i <= n ; i ++){
            fibo[i] = fibo[i - 1] % 1234567 + fibo[i - 2] % 1234567;
        }
        return fibo[n] % 1234567;
    }
}