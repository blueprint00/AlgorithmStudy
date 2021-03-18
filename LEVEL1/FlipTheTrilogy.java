package LEVEL1;

public class FlipTheTrilogy {
    public static void main(String[] args){
        int n = 45;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 0;
        String trilogy = "";
        while(n > 0){
            trilogy = (n % 3) + trilogy;
            n = n / 3;
        }
        System.out.println(trilogy);
        for(int i = 0; i < trilogy.length(); i ++){
            answer += Math.pow(3, i) * Integer.parseInt(trilogy.substring(i, i + 1));
        }
        return answer;
    }
}