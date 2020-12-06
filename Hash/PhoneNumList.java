package Hash;
import java.util.*;

public class PhoneNumList {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(solution(phone_book));
	}
	
    public static boolean solution(String[] phone_book) {
    	boolean answer = true;
    	
//    	for(int i = 0; i < phone_book.length; i ++) {
//    		for(int j = i + 1; j < phone_book.length; j ++) {
//    			if(phone_book[i].startsWith(phone_book[j]) || phone_book[j].startsWith(phone_book[i])) {
//    				answer = false;
//    				break;
//    			}
//    		}
//    	}
    	
    	HashMap<String, String> map = new HashMap<>();
    	
    	for(String phone : phone_book) {
    		map.put(phone, phone);
    	}
    	
    	for(int i = 0; i < phone_book.length; i ++) {
    		String phone = map.get(phone_book[i]);
    		for(int j = i + 1; j < phone_book.length; j ++) {
    			if(phone.startsWith(phone_book[j]) || phone_book[j].startsWith(phone)) {
    				answer = false;
    				break;
    			}
    		}
    	}
    	
    	return answer;
    }

}
