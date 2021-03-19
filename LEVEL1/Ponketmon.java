package LEVEL1;

import java.util.*;

public class Ponketmon {
    public static void main(String[] args){
        int[] nums = {3, 3, 3, 2, 2, 4};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return nums.length / 2 >= set.size() ? set.size() : nums.length / 2;
    }
}