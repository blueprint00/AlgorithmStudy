package LEVEL2;
import java.util.*;
public class OpenChat {
    public static void main(String[] args){
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        for(String str : solution(record))
            System.out.println(str);
    }
    public static String[] solution(String[] record) {
        ArrayList<String> chatLog = new ArrayList<>();
        HashMap<String, String> nickMap = new HashMap<>();

        for(String log : record){
            StringTokenizer st = new StringTokenizer(log);
            String command = st.nextToken();
            String userId = st.nextToken();
            String nickname = "";
            if(!command.equals("Leave")){
                nickname = st.nextToken();
            }

            switch(command){
                case "Enter" :
                    nickMap.put(userId, nickname);
                    // chatLog.add(userId + "님이 들어왔습니다.");
                    break;
                case "Leave" :
                    // chatLog.add(userId + "님이 나갔습니다.");
                    break;
                case "Change" :
                    nickMap.put(userId, nickname);
                    break;
            }
        }
        
        String[] answer = new String[chatLog.size()];
        int logIdx = 0;
        // for(String str: chatLog){
            // int endOfId = str.indexOf("님");
            // String userId = str.substring(0, endOfId);
            // answer[logIdx ++] = str.replace(userId, nickMap.get(userId));
        // }
        for(String str : record){
            String[] splitStr = str.split(" ");
            String id = splitStr[1];
            if(splitStr[0].equals("Enter")){
                answer[logIdx++] = nickMap.get(id) + "님이 들어왔습니다.";
            } else if(splitStr[0].equals("Leave")){
                answer[logIdx ++] = nickMap.get(id) + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}