package LEVEL1;
import java.util.*;

public class SameNum {
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] num = solution(arr);
		for(int i = 0; i < num.length; i ++) {
			System.out.println(num[i]);
		}
	}
	public static int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>(); 
        
        int idx = 0, cnt = 1;
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i ++) {
        	if(list.get(idx) != arr[i]) {
        		list.add(arr[i]);
        	   	idx ++;
        	}
        }
        
//        int preNum = 10;
//        for(int num : arr) {
//        	if(preNum != num) list.add(num);
//        	preNum = num;
//        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i ++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
