package LEVEL2;
import java.util.*;
public class EnglishWordChain {
    public static void main(String[] args){
        int n = 2;
        String[] words = {"abc", "ccm", "mom", "mom"};//"hello", "one", "even", "never", "now", "world", "draw"};//"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        for(int i : solution(n, words)){
            System.out.println(i);
        }
    }
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Map<String, Integer> map = new HashMap<>();
        int cnt = 1;
        char end = words[0].charAt(words[0].length() - 1);
        map.put(words[0], 1);
        for(int i = 1; i < words.length; i ++){
            char start = words[i].charAt(0);
            System.out.println(end + " " + start);
            if(end != start || map.containsKey(words[i])){
                answer[0] = cnt % n + 1;
                answer[1] = cnt / n + 1;
                System.out.println("?? " + cnt);
                break;
            }
            if(end == start) {
                cnt ++;
                end = words[i].charAt(words[i].length() - 1);
                map.put(words[i], 1);
            }
        }
        return answer;
    }
}