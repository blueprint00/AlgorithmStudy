package Hash;
import java.util.*;

public class Runner {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"kiki", "eden"};
		
		
		System.out.println(solution(participant, completion));
	}
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // for(int i = 0; i < participant.length; i ++){
        //     for(int j = 0; j < completion.length; j ++){
        //         if(participant[i].equals(completion[j])){
        //             participant[i] = "null";
        //             completion[j] = "null";
        //             break;
        //         }
        //     }
        // }
        // int k = 0;
        // while(true){
        //     if(!participant[k].equals("null")){
        //         answer = participant[k];
        //         break;
        //     }
        //     k ++;
        // }
        
        /*
        Map <String, Integer> map = new HashMap<>();
        int val = 0;
        
        for(String part : participant) {
            if(map.get(part) == null){
                map.put(part, 1);
            } else {
                val = map.get(part) + 1;
                map.put(part, val);
            }
        }
        
        for(String comp : completion){
            val = map.get(comp) - 1;
            map.put(comp, val);
        }
        
        for(String key : map.keySet()){
            if(map.get(key) == 1)
                answer = key;
        }*/
        
//        HashMap <String, Integer> map = new HashMap<>();
//        
//        for(String part : participant) {
//            if(map.get(part) == null){
//                map.put(part, 1);
//            } else {
//                map.put(part, map.get(part) + 1);
//            }
//        }
//        
//        for(String comp : completion){
//            map.put(comp, map.get(comp) - 1);
//        }
//        
//        for(String key : map.keySet()){
//            if(map.get(key) == 1)
//                answer = key;
//        }
// 
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String part : participant) {
            //210320
        	// if(map.get(part) == null) {
        	// 	map.put(part, 1); // 참가자 수 카운트, 값 1
        	// } else {
        	// 	map.put(part, map.get(part) + 1); // 동명이인 있을 시 +1
        	// }
            map.put(part, map.getOrDefault(part, 0) + 1); //210320
        }
        
        for(String comp : completion) {
        	map.put(comp, map.get(comp) - 1); // 완주 했으므로 값 -1
        }
        
        for(String key : map.keySet()) {
        	if(map.get(key) == 1) // 만약 값이 1이다 == -1 이 안 됐다 == 완주x
        		answer = key;
        }
        
        return answer;
    }   
}
