package BruteForce;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		int[] answers = {1, 2, 3, 4, 5};
		for(int ans : solution(answers)) {
			System.out.println(ans);
		}
	}
	
	public static int[] solution(int[] answers) {
        //210324
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        ArrayList<Integer> correct = new ArrayList<>();
        int answer1 = 0, answer2 = 0, answer3 = 0;

        for(int i = 0; i < answers.length; i ++){
            if(answers[i] == one[i % one.length]) answer1 ++;
            if(answers[i] == two[i % two.length]) answer2 ++;
            if(answers[i] == three[i % three.length]) answer3 ++;
        }

        int max = Math.max(answer1, Math.max(answer2, answer3));

        if(answer1 == max) correct.add(1);
        if(answer2 == max) correct.add(2);
        if(answer3 == max) correct.add(3);
        
        int[] answer = new int[correct.size()];
        for(int i = 0; i < correct.size(); i ++){
            answer[i] = correct.get(i);
        }
        return answer;

        // ArrayList<Integer> correct = new ArrayList<>();
        // int answer1 = 0, answer2 = 0, answer3 = 0;
        // int[] one = {1, 2, 3, 4, 5};
        // int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        // int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // for(int i = 0; i < answers.length; i ++) {    	
        // 	if(answers[i] == one[i % one.length]) answer1 ++;
        // 	if(answers[i] == two[i % two.length]) answer2 ++;        	
        // 	if(answers[i] == three[i % three.length]) answer3 ++;
        // }
        
        // int max = Math.max(answer1, Math.max(answer2, answer3));
        
        // if(answer1 == max) correct.add(1);
        // if(answer2 == max) correct.add(2);
        // if(answer3 == max) correct.add(3);
        
        // int[] answer = new int[correct.size()];
        // for(int i = 0; i < answer.length; i ++) {
        // 	answer[i] = correct.get(i);
        // }
        
        // return answer;
    }
}
