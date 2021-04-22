package LEVEL2;

public class JadenCaseString {
    public static void main(String[] args){
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String firstStr = s.charAt(0) + "";
        answer.append(firstStr.toUpperCase());
        for(int i = 1; i < s.length(); i ++){
            String now = s.charAt(i) + "";
            if(now.equals(" ")) answer.append(" ");
            else if(s.charAt(i - 1) == ' ') answer.append(now.toUpperCase());
            else answer.append(now.toLowerCase());
        }
        // String[] str = s.split(" ", -1);
        // for(int i = 0; i < str.length; i ++){
        //     StringBuilder sb = new StringBuilder(str[i]);
        //     if((sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z') || (sb.charAt(0) >= 'A' && sb.charAt(0) <= 'Z')) {
        //         sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
        //     }
        //     sb.replace(1, sb.length(), sb.substring(1).toLowerCase());
            
        //     answer.append(sb);
        //     if(i < str.length - 1) answer.append(" ");
        // }
        return answer.toString();
    }
}