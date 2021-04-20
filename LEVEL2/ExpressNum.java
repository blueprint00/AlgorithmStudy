package LEVEL2;

public class ExpressNum {
    public static void main(String[] args){
        int n = 15;
        System.out.println(solution(n));
    }
    public static int add(int i, int n){
        n -= i ;
        int answer = 0;
        System.out.println(i + " " + n);
        if(n == 0) {
            System.out.println("+1");
            return 1;
        }
        else if(n > 0) answer += add(i + 1, n);
        System.out.println(answer);
        return answer;
    }
    public static int solution(int n){
        int answer = 0;
        for(int i = 1; i <= n; i ++){
            answer += add(i, n);
            System.out.println(answer);
        }
        return answer;
    }
}