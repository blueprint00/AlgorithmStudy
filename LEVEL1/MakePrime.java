package LEVEL1;

public class MakePrime {
    public static void main(String[] args){
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j ++){
                for(int k = j + 1; k < nums.length; k ++){
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean flag = true;
                    for(int n = 2; n <= Math.sqrt(sum); n ++){
                        if(sum % n == 0) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) answer ++;
                }
            }
        }
        return answer;
    }
}