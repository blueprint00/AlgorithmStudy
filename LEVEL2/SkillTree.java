package LEVEL2;

public class SkillTree {
    public static void main(String[] args){
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_trees));
    }
    
    public static int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        int prevIdx = 0, currIdx = 0;
        
        for(String skill_tree : skill_trees){
            prevIdx = skill_tree.indexOf(skill.charAt(0));
            for(int i = 0; i < skill.length(); i ++){
                currIdx = skill_tree.indexOf(skill.charAt(i));

                if((prevIdx > currIdx || prevIdx == -1) && currIdx != -1){
                    answer --;
                    break;
                }
                prevIdx = currIdx;
            }
        }

        return answer;
    }
}