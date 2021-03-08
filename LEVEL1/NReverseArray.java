package LEVEL1;
import java.util.*;
public class NReverseArray {
	public static void main(String[] args) {
		long n = 12345;
		for(int i : solution(n))
			System.out.println(i);
	}
	public static int[] solution(long n) {
        List<Integer> arr = new ArrayList<>();
        while(n > 0){
            arr.add((int) (n % 10));
            n = n / 10;
        }
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i ++)
            answer[i] = arr.get(i);
        return answer;
    }
}
