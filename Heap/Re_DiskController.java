package Heap;
import java.util.*;

public class Re_DiskController {
	public static void main(String[] args) {
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		System.out.println(solution(jobs));
	}
	
	public static int solution(int[][] jobs) {
        int answer = 0;
        int cnt = 0; // 수행된 일의 갯수
        int jobsIdx = 0; // jobs의 인덱스
        int end = 0; // 일이 끝난 시점
        
        //요청시간 오름차순 정렬 
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        //처리 시간 오름차순 정렬 우선순위 큐
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
		
        while(cnt < jobs.length) {
        	// 하나의 작업이 완료되는 시점(end)까지 들어온 모든 요청을 큐에 넣음
        	while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) {
				pq.add(jobs[jobsIdx++]);
			}

			// 큐가 비어있다면 작업 완료(end) 이후에 다시 요청이 들어온다는 의미
			// (end를 요청의 가장 처음으로 맞춰줌)
			if (pq.isEmpty()) {
				end = jobs[jobsIdx][0];

			// 작업이 끝나기 전(end 이전) 들어온 요청 중 가장 수행시간이 짧은 요청부터 수행
			} else {
				int[] temp = pq.poll();
				answer += temp[1] - temp[0] + end ;
				end += temp[1];
				cnt++;
			}
		}

		return (int) Math.floor(answer / jobs.length);
	}
}
