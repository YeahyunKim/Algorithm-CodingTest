import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int order = 0;
        
        String convertedTree = "";
        StringBuilder indexTree = new StringBuilder();
        StringBuilder sortTree = new StringBuilder();
        
        for(int i = 0; i < skill_trees.length; i++) {
            convertedTree = skill_trees[i];
            for(int j = 0; j < skill.length(); j++) {
                convertedTree = convertedTree.replaceAll(skill.charAt(j) + "", String.valueOf(skill.indexOf(skill.charAt(j) + "") + 1));
            }
            
            for(char c : convertedTree.toCharArray()) {
                if(Character.isDigit(c)) {
                    indexTree.append(c);
                }
            }
            
            for(int j = 1; j < indexTree.length() + 1; j++) {
                sortTree.append(j+"");
            }
            
            if(sortTree.toString().equals(indexTree.toString())) {
                answer++;
                indexTree = new StringBuilder();
                sortTree = new StringBuilder();
            } else {
                indexTree = new StringBuilder();
                sortTree = new StringBuilder();
            }
        }

        return answer;
    }
}