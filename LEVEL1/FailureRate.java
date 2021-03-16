package LEVEL1;
import java.util.*;
public class FailureRate {
    public static void main(String[] args){
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        for(int i : solution(N, stages)){
            System.out.println(i);
        }
    }
    public static int[] solution(int N, int[] stages) {
        // Map<Integer, Double> map = new HashMap<>();

        // Arrays.sort(stages);
        // for(int stage : stages){
        //     //현재 스테이지 도전 사용자
        //     map.put(stage, map.getOrDefault(stage, 0.0) + 1);
        // }
        
        // int cnt = 0;
        // int i;
        // for(i = 0; i < stages.length - 1; i ++){
        //     if(stages[i] != stages[i + 1])
        //         map.put(stages[i], map.get(stages[i]) / stages.length - cnt);
           
        //     cnt ++;


        // } 
        // //i == stages.length - 1
        

        int[] answer = new int[N];
        Fail[] fails = new Fail[N]; // 실패율

        double players;
        double inStage;
        for(int i = 1; i <= N; i ++){
            players = 0;
            inStage = 0;
            for(int j = 0; j < stages.length; j ++){
                if(i <= stages[j]){
                    players ++;
                    if(i == stages[j]) inStage ++;
                }
            }
            if(players == 0) // 0 나누기 예외처리
                fails[i - 1] = new Fail(i, 0);
            else fails[i - 1] = new Fail(i, inStage/players);
        }       

        Arrays.sort(fails, (o1, o2) -> {
            return Double.compare(o2.rate, o1.rate);
        });

        for(int i = 0; i < N; i ++){
            answer[i] = fails[i].num;
        }
        return answer;
    }

    static class Fail{
        int num;
        double rate;
        Fail(int num, double rate){
            this.num = num;
            this.rate = rate;
        }
    }
}
