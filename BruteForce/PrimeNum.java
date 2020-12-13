package BruteForce;
import java.util.*;

public class PrimeNum {
	public static void main(String[] args) {
		String numbers = "2";
		System.out.println(solution(numbers));
	}
	
	public static int solution(String numbers) {
        int answer = 0;
    	TreeSet<Integer> set = new TreeSet<>(); // 중복 제거, 정렬
      
        //순열 알고리즘....
        permutation("", numbers, set);
        
        for(Integer num : set) {
        	if(num > 1 && isPrime(num)) answer ++;
        	System.out.println(num + " " +isPrime(num));
        }
        
        return answer;
	}
	
	public static void permutation(String prefix, String str, TreeSet<Integer> set) {
		int len = str.length();
		if(!prefix.equals("")) { set.add(Integer.valueOf(prefix)); }
		
		for(int i = 0; i < len; i ++) {
			permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, len), set);
		}
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i ++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
