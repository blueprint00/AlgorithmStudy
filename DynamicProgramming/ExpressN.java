package DynamicProgramming;
import java.util.*;
 
public class ExpressN {
	public static void main(String[] args) {
		int N = 5;
		int number = 12;
		System.out.println(solution(N, number));
	}
	public static int solution(int N, int number) {
        int answer = -1;
        List<Set<Integer>> arr = new ArrayList<>();
        
        arr.add(null);
        arr.add(new TreeSet<>());
        arr.get(1).add(N);
        
        for(int i = 1; i <= 8; i ++) {
        	if(i >= 2) {
        		int num = 0;
        		for(int j = 0; j < i; j ++) {
        			num += (int) (N * Math.pow(10, j));
        		}
                arr.add(new TreeSet<>());
        		arr.get(i).add(num);
        		
        		for(int j = 1; j < i; j ++) {
        			for(int k : arr.get(j)) {
        				for(int l : arr.get(i - j)) {
        					arr.get(i).add(k + l);
        					arr.get(i).add(k - l);
        					arr.get(i).add(k * l);
        					if(l != 0) arr.get(i).add(k / l);
        				}
        			}
        		}
        	}
        	
        	if(arr.get(i).contains(number)) return i;
        }
        
        return answer;
    }
}
