package LEVEL1;

public class GCDLCM {
	public static void main(String[] args) {
		int n = 11;
		int m = 12;
		System.out.println(solution(n, m)[0] + " " + solution(n, m)[1]);
	}
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        for(int i = min; i > 0; i --){
            if(max % i == 0 && min % i == 0) {
                answer[0] = i;
                break;
            }
        }
        answer[1] = (n * m) / answer[0];
        
        return answer;
	}
}
