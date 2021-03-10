package LEVEL1;

public class RemoveTheSmallestNumber {
	public static void main(String[] args) {
		int[] arr = { 4,3, 2, 1};
		for(int i : solution(arr)) {
			System.out.println(i);
		}
	}
	public static int[] solution(int[] arr) {
		if(arr.length == 1) return new int[] {-1};
		
		int min = arr[0];
		for(int i : arr) {
			if(min > i) min = i;
		}
		int[] answer = new int[arr.length - 1];
		int idx = 0;
		for(int i : arr) {
			if(i != min) answer[idx ++] = i;
		}
		return answer;
	}
}
