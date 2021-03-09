package LEVEL1;
import java.util.*;
public class PlaceInOrderOfIntegerDescendingOrder {
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
	public static long solution(long n) {
        long answer = 0;
        List<Long> arr = new ArrayList<>();
        while(n > 0){
            arr.add(n % 10);
            n /= 10;
        }
        Collections.sort(arr, Collections.reverseOrder());
        
        for(long i : arr){
            answer = answer * 10 + i;
        }
        return answer;
    }
}
