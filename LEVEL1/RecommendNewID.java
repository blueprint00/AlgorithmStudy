package LEVEL1;

import java.util.*;

public class RecommendNewID {
	public static void main(final String[] args) {
        final String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));
    }

    public static String solution(String new_id) {
        String answer = "";
        Deque<Character> dq = new LinkedList<>();
        Deque<Character> newDq = new LinkedList<>();

        // 1단계 : 대문자 -> 소문자
        new_id = new_id.toLowerCase();

        // 2단계 ; 문자 제거
        for(char ch : new_id.toCharArray()){
            if((ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' || ch == '-' || ch == '_' || ch == '.')) dq.offer(ch);
        }      

        // 3단계 : 마침표가 2번 이상 연속되면 하나로 치환
        char prev = dq.poll();
        newDq.offer(prev);

        while(!dq.isEmpty()){
            char ch = dq.poll();
            if(ch == '.' && ch == prev) continue;
            newDq.offer(ch); 
            prev = ch;
        }

        // 4단계 : 처음, 끝에 위치한 마침표 제거
        if(newDq.size() == 1){
            if(newDq.peekFirst() == '.') newDq.pollFirst();
        } else {
            if(newDq.peekFirst() == '.') newDq.pollFirst();
            if(newDq.peekLast() == '.') newDq.pollLast();
        }
        // 5단계 : 빈 문자열인 경우 "a" 대입
        if(newDq.size() == 0) newDq.offer('a');

        // 6단계 : 문자열 길이 15 이하로, 끝에 마침표 존재할 경우 제거
        if(newDq.size() > 15){
            while(newDq.size() != 15){
                newDq.pollLast();
            }
            if(newDq.peekLast() == '.') newDq.pollLast();
        }

        // 7단계 : 문자열 길이가 2 이하 인 경우, 마지막 문자를 길이가 3이 될 떄까지 이어붙이기
        if(newDq.size() <= 2){
            while(newDq.size() != 3){
                char ch = newDq.peekLast();
                newDq.offer(ch);
            }
        }

        for(char ch : newDq){
            answer += ch;
        }
        return answer;
    }
}
