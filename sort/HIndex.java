package sort;
import java.util.*;

public class HIndex {
	public int solution(int[] citations) {
        int answer = 0;
        int h = 0, k = 0;
        
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i ++){
            h = citations[i];
            k = citations.length - i;
            
            if(k <= h) {
                answer = k;
                break;
            }
        }
        
        return answer;
    }
}
