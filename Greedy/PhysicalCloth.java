package Greedy;
import java.util.*;

public class PhysicalCloth {
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reverse = {1};
		
		System.out.println(solution(n, lost, reverse));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
		 int answer = n - lost.length;
		 Arrays.sort(lost);
	     Arrays.sort(reserve);
	     
	     //여벌 체육복을 가져온 학생이 도난 당한 경우
		 for(int i = 0; i < lost.length; i ++) {
			for(int j = 0; j < reserve.length; j ++) {
				 if(lost[i] == reserve[j]) {
					 lost[i] = -1;
					 reserve[j] = -1;
					 answer ++;
					 break;
				 }
			 }
		 }
		 
		 for(int i = 0; i < lost.length; i ++) {
			for(int j = 0; j < reserve.length; j ++) {
				if(lost[i] - reserve[j] == 1 || reserve[j] - lost[i] == 1) {
					reserve[j] = -1;
					answer ++;
					break;
				}
			}
		 }
		 return answer;
		 
//        int answer = 0;
//        
//        int[] student = new int[n];
//        int idxR = 0, idxL = 0;
//        
//        for(int i = 0; i < n; i ++) student[i] = 1;
//        
//        for(int i = 0; i < n; i ++) {
//        	if(i + 1 == reserve[idxR]) {
//        		student[i] ++;
//        		idxR ++; if(idxR == reserve.length) break;
//        	}
//        }
//        for(int i = 0; i < n; i ++) {
//        	if(i + 1 == lost[idxL]) {
//        		student[i] --;
//        		idxL ++; if(idxL == lost.length) break;
//        	}
//        }// 초기화
//
//        System.out.println("=======");
//        for(int i : student) System.out.println(i);
//        
//        for(int i = 0; i < n; i ++) {
//        	if(student[i] == 0) {
//        		if(i - 1 >= 0 && i + 1 < n) {
//        			if(student[i + 1] == 2) {
//        				student[i] = 1;
//        				student[i + 1] = 1;
//        			}
//        		
//	        		if(i + 1 < n) {
//	        			if(student[i - 1] == 2) {
//	        				student[i] = 1;
//	        				student[i - 1] = 1;
//	        			}
//	        		}
//        		}
//        	}
//        }
//        System.out.println("=======");
//        for(int i : student) System.out.println(i);
//        
//        for(int i = 0; i < n; i ++) if(student[i] > 0) answer ++; 
//        return answer;
		
		/*int answer = 0;
        int[] cnt = new int[n];
        int idxR = 0, idxL = 0;
        int idx = 0;
        
        for(int i = 0; i < n; i ++) cnt[i] = 1;
        
        for(int i = 0; i < n; i ++){
        	if(i + 1 == reserve[idxR]){
        		cnt[i] ++;
        		idxR ++; if(idxR == reserve.length) break;
        	}
    	}
        for(int i = 0; i < n; i ++){
        	if(i + 1 == lost[idxL]){
        		cnt[i] --;
        		idxL ++; if(idxL == lost.length) break;
        	}
        } //초기화
        
        for(int i = 0; i < lost.length; i ++){
        	idx = lost[i] - 1;
        	boolean b1 = true, b2 = true;
            if(idx - 1 < 0) b1 = false;
            if(idx + 1 >= n) b2 = false;
            if(b1){
	            if(cnt[idx - 1] == 2){
	            	cnt[idx - 1] = 1;
	            	cnt[idx] = 1;
	            	//answer ++;   	
	            }
            }
            if(b2){
	            if(cnt[idx + 1] == 2){
	            	if(cnt[idx] == 0){ // cnt[idx] != 2
	    	            cnt[idx + 1] = 1;
	    	            cnt[idx] = 1;
	    	            //answer ++;
		            }
	            } 
            }
        }
        for(int i = 0; i < n; i ++) if(cnt[i] > 0) answer ++;
                
        return answer;*/
    }
}
