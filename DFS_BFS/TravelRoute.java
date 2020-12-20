package DFS_BFS;
import java.util.*;

public class TravelRoute {
	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
		for(String str : solution(tickets))
			System.out.println(str);
	}
	
	public static String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length + 1];
        boolean[] visited = new boolean[tickets.length];
        
        Arrays.sort(tickets, new Comparator<String[]>() {
        	@Override
        	public int compare(String[] o1, String[] o2) {
        		return o1[1].compareTo(o2[1]);
        	}
        });
        
        answer[0] = "ICN";        
        int index = 1;
        while(index < tickets.length + 1) {
        	for(int i = 0; i < tickets.length; i ++) {
        		if(visited[i]) continue;
        		
        		if(tickets[i][0].equals(answer[index - 1])) {
        			boolean flag = false;
        			
        			for(int j = 0; j < tickets.length; j ++) {
        				if(index == tickets.length || tickets[i][1].equals(tickets[j][0]) && !visited[j]) {
        					flag = true;
        					break;
        				}
        			}
        			if(!flag) continue;
        			
        			visited[i] = true;
        			answer[index ++] = tickets[i][1];
        			break;
        		}
        		
        	}
        }
     
        return answer;
    }
}
