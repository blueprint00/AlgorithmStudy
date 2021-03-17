package LEVEL1;

public class DartGame {
    public static void main(String[] args){
        String dartResult = "1S2D*3T";
        System.out.println(solution(dartResult));
    }
    public static int solution(String dartResult) {
        int answer = 0;
        int[] point = new int[3]; // 세 번까지 던짐        
        int idx = 0;

        String tmp = "";
        for(int i = 0; i < dartResult.length(); i ++){
            char ch = dartResult.charAt(i);
            if(ch >= '0' && ch <= '9'){
                tmp += String.valueOf(ch); // 10점도 존재함...
            } else if(ch == 'S' || ch == 'D' || ch == 'T'){
                int score = Integer.parseInt(tmp);

                if(ch == 'D') score = (int) Math.pow(score, 2);
                else if(ch == 'T') score = (int) Math.pow(score, 3);

                point[idx ++] = score;
                tmp = "";
            } else {
                if(ch == '#'){   
                    point[idx - 1] *= -1;
                } else if(ch == '*'){
                    point[idx - 1] *= 2;
                    if(idx - 2 >= 0) point[idx - 2] *= 2;
                }
            }
        }

        for(int p : point) {
            answer += p;
        }

        return answer;
    }
}