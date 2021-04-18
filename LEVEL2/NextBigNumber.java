package LEVEL2;

public class NextBigNumber {
    public static void main(String[] args){
        int n = 15;
        System.out.println(solution(n));
    }
    public static int countOne(String str){
        int cnt = 0;
        for(char ch : str.toCharArray()){
            if(ch == '1') cnt ++;
        }
        return cnt;
    }

    public static int solution(int n) {
        String nBi = Integer.toBinaryString(n);
        for(int i = n + 1; ; i ++){
            String compare = Integer.toBinaryString(i);
            if(countOne(nBi) == countOne(compare))
                return i;
        }
        // int bitCount = Integer.bitCount(n);
        // for(int i = n + 1; ; i ++){
        //     if(bitCount == Integer.bitCount(i))
        //         return i;
        // }
    }
}