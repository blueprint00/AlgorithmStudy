package LEVEL2;
import java.util.*;
public class MinMax {
    public static void main(String[] args){
        String s = "-1 -2 -3 -4";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        List<Integer> arr = new ArrayList<>();
        for(String tmp : s.split(" ")){
            arr.add(Integer.parseInt(tmp)); 
        }        
        Collections.sort(arr);
        return arr.get(0) + " " + arr.get(arr.size() - 1);
    }
}