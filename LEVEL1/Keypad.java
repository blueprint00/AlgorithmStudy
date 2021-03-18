package LEVEL1;

public class Keypad {
    public static void main(String[] args){
        int[] numbers = {1, 3, 4, 5, 8 ,2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }
    public static int getLength(int prev, int n){
        n = (n == 0) ? 11 : n;
        prev = (prev == 0) ? 11 : prev;

        int prev_x = (prev - 1) / 3; // 손가락의 x 좌표
        int prev_y = (prev - 1) % 3; // 손가락의 y 좌표
        int x = n / 3; // 해당 숫자의 x 좌표
        int y = 1; // 해당 숫자의 y의 좌표 (2번째 줄이므로 1로 고정)

        return Math.abs(prev_x - x) + Math.abs(prev_y - y);

    }
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int prevLeft = 10;
        int prevRight = 12;
        for(int n : numbers){
            if(n == 1 || n == 4 || n == 7) {
                answer += "L";
                prevLeft = n;
            } else if(n == 3 || n == 6 || n == 9){
                answer += "R";
                prevRight = n;
            } else { // 2, 5, 8, 0
                int left = getLength(prevLeft, n);
                int right = getLength(prevRight, n);

                if(left < right) {
                    System.out.println("L");
                    answer += "L";
                    prevLeft = n;
                } else if(left > right) {
                    System.out.println("R");
                    answer += "R";
                    prevRight = n;
                } else {
                    if(hand.equals("left")){
                        System.out.println("L");
                        answer += "L";
                        prevLeft = n;
                    } else {
                        System.out.println("R");
                        answer += "R";
                        prevRight = n;
                    }
                }
            }
        }
        return answer;
    }
}