package LEVEL2;

public class CompressString {
    public static void main(String[] args){
        String s = "ababcdcdababcdcd";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = s.length();
        int length = 1;
        while(length <= s.length() / 2){
            String pattern = "";
            String compression = "";
            int cnt = 1;

            for(int i = 0; i < s.length() + length; i += length){
                String curr = "";

                if(i >= s.length()){ // 현재 문자열이 없을 때
                    curr = "";
                } else if(s.length() < i + length){ // 마지막 현재 문자열 일 때
                    curr = s.substring(i);
                } else {
                    curr = s.substring(i, i + length);
                }

                if(i != 0){
                    if(curr.equals(pattern)) cnt ++;
                    else if(cnt >= 2){
                        compression += cnt + pattern;
                        cnt = 1;
                    } else {
                        compression += pattern;
                    }
                }
                pattern = curr;
            }

            length ++;
            answer = Math.min(answer, compression.length());
        }

        return answer;
    }
}