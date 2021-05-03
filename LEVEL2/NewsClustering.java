package LEVEL2;
import java.util.*;
public class NewsClustering {
    public static void main(String[] args){
        String str1 = "aaa";
        String str2 = "aaaa";
        System.out.println(solution(str1, str2));
    }
    public static int solution(String str1, String str2) {
        double answer = 0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(int i = 0; i < str1.length() - 1; i ++){
            char ch1 = str1.charAt(i);
            char ch2 = str1.charAt(i + 1);
            if(ch1 >= 'a' && ch1 <= 'z' && ch2 >= 'a' && ch2 <= 'z'){
                map1.put(str1.substring(i, i + 2), map1.getOrDefault(str1.substring(i, i + 2), 0) + 1);
            }
        }
        for(int i = 0; i < str2.length() - 1; i ++){
            char ch1 = str2.charAt(i);
            char ch2 = str2.charAt(i + 1);
            if(ch1 >= 'a' && ch1 <= 'z' && ch2 >= 'a' && ch2 <= 'z')
                map2.put(str2.substring(i, i + 2), map2.getOrDefault(str2.substring(i, i + 2), 0) + 1);
        }

        int cnt = 0;
        for(String a : map1.keySet()){
            if(map2.containsKey(a))
                cnt += Math.min(map1.get(a), map2.get(a));
        }

        int len1 = 0, len2 = 0;
        for(int i : map1.values()) len1 += i;
        for(int i : map2.values()) len2 += i;
        
        answer = (double) cnt / (len1 + len2 - cnt);
        if(len1 + len2 - cnt == 0) return 65536;
        return (int) (answer * 65536);
    }
}