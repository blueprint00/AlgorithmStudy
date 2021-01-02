package Graph;
import java.util.*;

public class Rank {
	public static void main(String[] args) {
		int n = 5;
		int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
		System.out.println(solution(n, results));
	}
	
	public static int solution(int n, int[][] results) {
		int answer = 0;
		int[][] matches = new int[n][n];
		for(int i = 0; i < n; i ++) {
			for(int j = 0 ; j < n; j ++) {
				matches[i][j] = 100;	
			}
		}
		for(int[] result : results) {
			matches[result[0] - 1][result[1] - 1] = 1;
		}
		
		for(int k = 0; k < n; k ++) { // 중간에 거치는 노드
			for(int i = 0; i < n; i ++) { // 시작 노드
				for(int j = 0; j < n; j ++) { // 종료 노드
					if(matches[i][j] > matches[i][k] + matches[k][j]) {
						matches[i][j] = matches[i][k] + matches[k][j];
					}
				}
			}
		}
		
		for(int i = 0; i < n; i ++) {
			boolean flag = true;
			for(int j = 0; j < n; j ++) {
				if(i == j) continue;
				if(matches[i][j] == 100 && matches[j][i] == 100) {
					flag = false;
					break;
				}
			}
			if(flag) answer ++;
		}
		
		return answer;
	}
	
	//구글링 햇으나... 안됨
//	public static int solution(int n, int[][] results) {
//		int answer = 0;
//		int[][] matches = new int[n][n];
//		for(int[] result : results) {
//			matches[result[0] - 1][result[1] - 1] = 1; // 이김
//			matches[result[1] - 1][result[0] - 1] = -1; // 짐
//		}
//		
//		for(int player = 0; player < n; player ++) {
//			for(int enemy = 0; enemy < n; enemy ++) {
//				if(matches[player][enemy] == 1) { // 내가 이김
//					for(int i = 0; i < n; i ++) {
//						if(matches[enemy][i] == 1) { // 상대가 이긴 애들
//							matches[player][i] = 1; // 나도 이김
//							matches[i][player] = -1;
//						}
//					}
//				} else if(matches[enemy][player] == -1) { // 내가 짐 
//					for(int i = 0; i < n; i ++) {
//						if(matches[player][i] == 1) { // 내가 이긴 애들
//							matches[enemy][i] = 1; // 상대는 다 이김
//							matches[i][enemy] = -1; 
//						}
//					}
//				}
//			}
//		}
//		
//		for(int i = 0; i < n; i ++) {
//			int cnt = 0;
//			for(int j = 0; j < n; j ++) {
//				if(matches[i][j] != 0) cnt ++;
//			}
//			if(cnt == n - 1) answer ++;
//		}
//		
//		return answer;
//	}
	
	//내가 푼건... 틀
//	public static int solution(int n, int[][] results) {
//        int answer = 0;
//        List<Integer> heap = new ArrayList<>();
//        heap.add(0);
//        heap.add(results[0][0]);
//        for(int i = 2; i <= (int) Math.pow(2, n); i ++) {
//        	heap.add(-1);
//        }
//         
//        int idx_w, idx_l = heap.size() - 1;
//		for(int[] result : results) {
//        	idx_l = 3;
//        	if(!heap.contains(result[1])) {
//        		while(heap.get(idx_l) != -1) {
//        			idx_l = idx_l * 2 + 1;
//        		}
//        		heap.set(idx_l, result[1]);
//        	} else {
//        		idx_l = heap.indexOf(result[1]);
//        	}
//
//        	idx_w = idx_l - 1;
//        	if(!heap.contains(result[0])) {
//        		while(heap.get(idx_w) != -1) {
//        			idx_w /= 2;
//        		}
//            	heap.set(idx_w, result[0]);
//        	} else {
//        		idx_w = heap.indexOf(result[0]);
//        	}
//    		
//        	System.out.println(idx_w + " " + idx_l);
//        	if(idx_w < idx_l) continue;
//        	
//        	
//        	int remove_idx = idx_w;
//        	do { 
//        		idx_w /= 2; 
//        		idx_w -= (idx_w % 2);
//        	} while(heap.get(idx_w) != -1);
//        	heap.set(idx_w, heap.get(remove_idx));
//        	heap.remove(remove_idx);
//        }
//		
//		int cnt = 1;
//		for(int i = 1; i <= idx_l; i ++) {
//			System.out.print(heap.get(i) + " " );
//			if((i + 1) == (int) Math.pow(2, cnt)) {
//				System.out.println();
//				cnt ++;
//			}
//		}
//		
//		int idx = idx_l;
//		do {
//			answer ++;
//			idx /= 2;
//		} while(heap.get(idx - 1) != -1);
//        
//        return answer;
//    }
}
