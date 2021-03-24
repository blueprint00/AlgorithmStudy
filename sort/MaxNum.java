package sort;
import java.util.*;

public class MaxNum {
	public String solution(int[] numbers) {
        //210324   
        String answer = "";
        int len = numbers.length;

        String[] str_numbers = new String[len];
        for(int i = 0; i < len; i ++){
            str_numbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str_numbers, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return (o2 + o1).compareTo(o1 + o2); // 내림차순
            }    
        });
        
        for(String str : str_numbers){
            answer += str;
        }

        return answer.charAt(0) == '0' ? "0" : answer;
        
        // String answer = "";
        
		// int len = numbers.length;
        
        // String[] str_numbers = new String[len];
        // for(int i = 0; i < len; i ++) {
        // 	str_numbers[i] = String.valueOf(numbers[i]);
        // }
        
        // Arrays.sort(str_numbers, new Comparator<String>() {
		// 	@Override
		// 	public int compare(String o1, String o2) {
		// 		return (o2 + o1).compareTo(o1 + o2);
		// 	}
        // });
        
        // for(int i = 0; i < str_numbers.length; i ++)
        //     answer += str_numbers[i];
        
        // return answer.charAt(0) == '0' ? "0" : answer;
    }
}
