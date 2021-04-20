package LEVEL2;

public class MinimumCommonMultipleOfN {
    public static void main(String[] args){
        int[] arr = {2, 6, 8, 14};
        System.out.println(solution(arr));
    }
    public static int MCM(int a, int b){
        for(int i = Math.max(a, b); ; i ++){
            if(i % a == 0 && i % b == 0) return i;
        }
    }
    public static int solution(int[] arr) {
        int mcm = MCM(arr[0], arr[1]);
        for(int i = 2; i < arr.length; i ++){
            mcm = MCM(arr[i], mcm);
        }

        return mcm;
    }
}