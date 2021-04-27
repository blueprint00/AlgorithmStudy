package LEVEL2;
import java.util.*;
public class Tuple {
    public static void main(String[] args){
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        for(int i : solution(s)){
            System.out.println(s);
        }
    }
    public static int[] solution(String s) {
        StringTokenizer st = new StringTokenizer(s, "{}");
        ArrayList<String> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            if(!tmp.equals(",")) list.add(tmp);
        }
        // s = s.substring(2, s.length() - 1).replace("},{", "-");
        // String[] list = s.split("-"); 
        // Collections 아니고 Arrays
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return o1.length() - o2.length();
            }
        });

        ArrayList<String> ans = new ArrayList<>();
        for(String tmp : list){
            for(String str : tmp.split(",")){
                if(!ans.contains(str)){
                    ans.add(str);
                }
            }
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i ++){
            answer[i] = Integer.parseInt(ans.get(i));
        }
        return answer;
    }
}