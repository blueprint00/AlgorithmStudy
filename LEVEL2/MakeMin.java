package LEVEL2;

import java.util.*;

public class MakeMin {
    public static void main(String[] args){
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(solution(A, B));
    }
    public static int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0, j = B.length - 1; i < A.length && j >= 0; i ++, j --){
            answer += A[i] * B[j];
        }       
        return answer;
    }
}