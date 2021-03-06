package LEVEL1;
import java.util.*;
public class AddTwoAndMore {
	public static void main(String[] args) {
		int[] numbers = {5, 0, 2, 7};
		for(int i : solution(numbers)) {
			System.out.println(i);
		}
	}
	public static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        int idx = 0;
        for(int i = 0 ; i < numbers.length; i ++) {
        	for(int j = i + 1; j < numbers.length; j ++) {
        		if(set.add(numbers[i] + numbers[j])) {
        			ans.add(numbers[i] + numbers[j]);
        		}
        	}
        }
        
        Collections.sort(ans);
        int[] answer = new int[ans.size()];
        for(int i : ans) {
        	answer[idx ++] = i;
        }
        return answer;
    }
}
