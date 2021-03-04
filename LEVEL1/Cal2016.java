package LEVEL1;

public class Cal2016 {
	public static void main(String[] args) {
		System.out.println(solution(12, 18));
	}
	public static String solution(int a, int b) {    
		
//		String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
//        int day = 0;
//        for(int i = 1; i < a; i ++) {
//        	if(i <= 7) {
//        		if(i % 2 == 1) day += 31;
//        		else {
//        			if(i == 2) day += 29;
//        			else day += 30;
//        		}
//        	} else {
//        		if(i % 2 == 0) day += 31;
//        		else day += 30;
//        	}
//        }
//    	day += b;
//        
//        return week[(day - 1) % 7];
		
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int date = 0;
        for(int i = 0; i < a - 1; i ++) {
        	date += day[i];
        }
    	date += b;
        
        return week[(date - 1) % 7];
    }
}
