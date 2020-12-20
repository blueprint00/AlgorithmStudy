package Greedy;

import java.util.*;

public class CCTV {
	public static void main(String[] args) {
		int[][] routes = {{-20, 15}, {-14, -5}, {-18, -13}, {-5, -3}};
		System.out.println(solution(routes));
	}
	
	public static int solution(int[][] routes) {
        int answer = 0;
        
        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]); //{-18, -13}, {-14, -5}, {-5, -3}, {-20, 15}
        ArrayList<int[]> list = new ArrayList<>();
        for(int[] r : routes) {
        	list.add(r);
        }
        
        while(!list.isEmpty()) {
        	int out = list.get(0)[1];
        	for(int i = 0; i < list.size(); i ++) {
        		if(list.get(i)[0] <= out) {
        			list.remove(i);
        			i --;
        		}
        	}
        	
        	answer ++;
        }
        
        return answer;
    } 
}
