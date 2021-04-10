package LEVEL2;

public class Num124 {
    public static void main(String[] args){
        int n = 10;
        System.out.println(solution(n));
    }
    public static String solution(int n) {
        StringBuffer answer = new StringBuffer();
        n = n - 1;
        while(n > 0){
            if(n % 3 == 1) answer.append(1);
            else if(n % 3 == 2) answer.append(2);
            else if(n % 3 == 0) answer.append(4);   
            n = (n - 1) / 3;
        }
        return answer.reverse().toString();
    }
}