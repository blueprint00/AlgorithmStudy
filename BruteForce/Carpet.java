package BruteForce;

public class Carpet {
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		
		for(int ans : solution(brown, yellow))
			System.out.println(ans);
	}
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
       int w, h;
       double square = Math.sqrt(Math.pow((brown + 4) / 2, 2) - 4 * (brown + yellow));
        w = (int) ((brown + 4) / 2 + square) / 2;
        h = (int) ((brown + 4) / 2 - square) / 2;
        answer[0] = w;
        answer[1] = h;
        
        return answer;
    }
}
