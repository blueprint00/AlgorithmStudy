package LEVEL1;

public class SecretMap {
    public static void main(String[] args){
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};//9, 20, 28, 18, 11};
        int[] arr2 = {27, 56, 19, 14, 14, 10};//30, 1, 21, 17, 28};
        for(String str : solution(n, arr1, arr2)){
            System.out.println(str);
        }
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i ++){
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = "";
            if(str.length() < n) {
                String tmp = "";
                for(int j = 0; j < n - str.length(); j ++){
                    tmp += "0";
                }
                str = tmp + str;
            }
            for(int j = 0; j < n; j ++){
                if(str.charAt(j) == '1') answer[i] += "#";
                else answer[i] += " ";
            }
        }
        return answer;
    }
}