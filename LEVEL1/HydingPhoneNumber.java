package LEVEL1;

public class HydingPhoneNumber {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
	}
	public static String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        
        for(int i = 0; i < length - 4; i ++)
            answer += "*";
        for(int i = length - 4; i < length; i ++)
            answer += phone_number.charAt(i);
        
        return answer;
    }
}
