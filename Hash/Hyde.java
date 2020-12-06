package Hash;
import java.util.*;

public class Hyde {
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, 
							  {"blue_sunglasses", "eyewear"}, 
							  {"green_turban", "headgear"}};
		
		System.out.println(solution(clothes));
	}
	
    public static int solution(String[][] clothes) {
    	int answer = 1;
    	
    	HashMap<String, Integer> map = new HashMap<>();
    	
    	for(String[] cloth : clothes) { // 2차 배열 나누
    		System.out.println("1 " + cloth[0] + " " + cloth[1]);
    		map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1); // 종류별로 존재하지 않을 경우 0, 아니면 +1
    	}
    	
    	for(String key : map.keySet()) {
    		answer *= (map.get(key) + 1); // 조합 경우의 수 구하기
    	}
    	
    	return answer - 1; // 전체 경우에서 하나도 선택 안하는거 -1
    }
}
