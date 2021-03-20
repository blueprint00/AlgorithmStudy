package Hash;
import java.util.*;

public class PhoneNumList {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(solution(phone_book));
	}
	
    public static boolean solution(String[] phone_book) {
//    	for(int i = 0; i < phone_book.length; i ++) {
//    		for(int j = i + 1; j < phone_book.length; j ++) {
//    			if(phone_book[i].startsWith(phone_book[j]) || phone_book[j].startsWith(phone_book[i])) {
//    				return false;
//    			}
//    		}
//    	}
    	
		// for(String phone : phone_book){
		// 	map.put(phone, phone);
		// }
    	// for(int i = 0; i < phone_book.length; i ++) {
    	// 	String phone = map.get(phone_book[i]);
    	// 	for(int j = i + 1; j < phone_book.length; j ++) {
    	// 		if(phone.startsWith(phone_book[j]) || phone_book[j].startsWith(phone)) {
    	// 			return false;
    	// 		}
    	// 	}
    	// }

		// 210320
		Arrays.sort(phone_book, new Comparator<String>() {
			public int compare(String o1, String o2){
				return o2.length() - o1.length();
			}
		});

    	HashMap<String, String> map = new HashMap<>();
    	for(String phone : phone_book) {
			map.put(phone, phone);
			if(map.get(phone) != null) return false;
    		for(int i = 1, len = phone.length(); i <= len; i ++){
				map.put(phone.substring(0, i), "");
			}
    	}
    	
    	return true;
    }

}
