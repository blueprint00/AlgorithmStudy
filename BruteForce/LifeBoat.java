package BruteForce;

import java.util.Arrays;

public class LifeBoat {
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		
		System.out.println(solution(people, limit));
	}
	public static int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people); // 50, 50, 70, 80
        int right = people.length - 1;
  
//        for(int i = 0; i < right; i ++, answer ++) {
//        	while(right > i && people[i] + people[right --] > limit)
//        		answer ++;
//        }
        for(int left = 0; left < right + 1;) {
        	
        	if(people[left] + people[right] <= limit) {
        		answer ++;
        		left ++;
        		right --;
        	} else if(people[left] + people[right] > limit){
        		answer ++;
        		right --;
        	}
        	System.out.println(left + " " + right);
        }
        
        
        return answer;
    }
}
