package LEVEL2;

import java.math.BigInteger;

public class FineSquare {
    public static void main(String[] args){
        int w = 8;
        int h = 12;
        System.out.println(solution(w, h));
    }
    public static long solution(int w, int h) {
        long answer = 1;
        // int gcd = 0;
        // for(int i = Math.min(w, h); i > 0; i --){
        //     if(w % i == 0 && h % i == 0) {
        //         gcd = i; 
        //         break;
        //     }
        // }
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - (((long) w / gcd) + ((long) h / gcd) - 1) * gcd;
    }
}